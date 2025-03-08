import {beforeEach, describe, expect, it} from 'vitest'
import '@testing-library/jest-dom';
import {render, screen} from '@testing-library/react';
import {userEvent} from '@testing-library/user-event';
import ItemListManager from '../src/item-list-manager';

describe(
    'ItemListManager',
    () => {
      let inputField: HTMLInputElement;
      let addButton: HTMLElement;

      beforeEach(() => {
        const app = render(<ItemListManager/>);
        inputField = app.getByTestId('input-field') as HTMLInputElement;
        addButton = app.getByTestId('add-button');
      });

      it(
          'adds item to the list when button is clicked',
          async () => {
            await userEvent.type(inputField, 'Test Item');
            await userEvent.click(addButton);

            const listItems = screen.getAllByTestId('list-item');
            expect(listItems).toHaveLength(1);
            expect(listItems[0].textContent).toBe('Test Item');
          },
      );
      it(
          'input field is cleared after adding an item',
          async () => {
            await userEvent.type(inputField, 'Test Item');
            await userEvent.click(addButton);

            expect(inputField.value).toBe('');
          },
      );
      it(
          'it adds a normal item but does not add empty item to the list',
          async () => {
            await userEvent.type(inputField, 'Test Item');
            await userEvent.click(addButton);

            expect(inputField.value).toBe('');

            await userEvent.type(inputField, ' ');
            await userEvent.click(addButton);

            expect(screen.queryAllByTestId('list-item'))
                .toHaveLength(1);
          },
      );
      it(
          'adds multiple items to the list',
          async () => {
            await userEvent.type(inputField, 'First Item');
            await userEvent.click(addButton);

            await userEvent.type(inputField, 'Second Item');
            await userEvent.click(addButton);

            const listItems = screen.getAllByTestId('list-item');
            expect(listItems).toHaveLength(2);
            expect(listItems[0].textContent).toBe('First Item');
            expect(listItems[1].textContent).toBe('Second Item');
          },
      );
    },
);
