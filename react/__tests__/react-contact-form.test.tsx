import {beforeEach, describe, expect, it} from 'vitest'
import '@testing-library/jest-dom';
import {render, screen, waitFor} from '@testing-library/react';
import {userEvent} from '@testing-library/user-event';
import ReactContactForm from '../src/react-contact-form';

describe(
    'ReactContactForm',
    () => {
      beforeEach(() => {
        render(<ReactContactForm/>);
      });

      it(
          'displays error message when fields are empty and submit is clicked',
          async () => {
            await userEvent.click(screen.getByTestId('submit-button'));
            expect(screen.getByTestId('error-message').textContent)
                .toBe('All fields are required.');
          },
      );
      it(
          'displays submitted data when form is submitted with valid inputs',
          async () => {
            const nameInput: HTMLElement = screen.getByTestId('name-input');
            const emailInput: HTMLElement = screen.getByTestId('email-input');
            const messageInput: HTMLElement = screen.getByTestId('message-input');
            const submitButton: HTMLElement = screen.getByTestId('submit-button');

            await userEvent.type(nameInput, 'John Doe');
            await userEvent.type(emailInput, 'john@example.com');
            await userEvent.type(messageInput, 'Hello there!');

            await userEvent.click(submitButton);

            await waitFor(() => {
              const submittedData = screen.getByTestId('submitted-data');
              expect(submittedData).toBeInTheDocument();
              expect(submittedData).toHaveTextContent('Name: John Doe');
              expect(submittedData).toHaveTextContent('Email: john@example.com');
              expect(submittedData).toHaveTextContent('Message: Hello there!');
            });
          },
      );
      it(
          'clears input fields after successful submission',
          async () => {
            const nameInput: HTMLInputElement = screen.getByTestId('name-input');
            const emailInput: HTMLInputElement = screen.getByTestId('email-input');
            const messageInput: HTMLInputElement = screen.getByTestId('message-input');
            const submitButton: HTMLElement = screen.getByTestId('submit-button');

            await userEvent.type(nameInput, 'John Doe');
            await userEvent.type(emailInput, 'john@example.com');
            await userEvent.type(messageInput, 'Hello there!');

            await userEvent.click(submitButton);

            expect(nameInput.value).toBe('');
            expect(emailInput.value).toBe('');
            expect(messageInput.value).toBe('');
          },
      );
    },
);
