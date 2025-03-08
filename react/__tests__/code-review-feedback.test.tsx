import {beforeEach, describe, expect, it} from 'vitest'
import '@testing-library/jest-dom';
import {render, screen} from '@testing-library/react';
import {userEvent} from '@testing-library/user-event';
import CodeReviewFeedback from '../src/code-review-feedback';

describe(
    'CodeReviewFeedback',
    () => {
      beforeEach(() => {
        render(<CodeReviewFeedback/>);
      });

      describe(
          'Initial Page Rendering Tests',
          () => {
            it(
                'should render all aspects with their upvote and downvote buttons and counts',
                () => {
                  for (let i = 0; i < 5; i++) {
                    expect(screen.queryByTestId(`upvote-btn-${i}`))
                        .toBeInTheDocument();
                    expect(screen.queryByTestId(`downvote-btn-${i}`))
                        .toBeInTheDocument();
                    expect(screen.queryByTestId(`upvote-count-${i}`).textContent)
                        .toBe('Upvotes: 0');
                    expect(screen.queryByTestId(`downvote-count-${i}`).textContent)
                        .toBe('Downvotes: 0');
                  }
                },
            );
            it(
                'upvotes and downvotes count for the all aspects should be 0',
                () => {
                  for (let i = 0; i < 5; i++) {
                    expect(screen.getByTestId(`upvote-count-${i}`).textContent)
                        .toBe('Upvotes: 0');
                    expect(screen.getByTestId(`downvote-count-${i}`).textContent)
                        .toBe('Downvotes: 0');
                  }
                },
            );
          },
      );

      describe(
          'Functionality Tests',
          () => {
            it(
                'should increment the upvote count for readability when upvote button is clicked',
                async () => {
                  await userEvent.click(screen.getByTestId('upvote-btn-0'));
                  expect(screen.getByTestId('upvote-count-0').textContent)
                      .toBe('Upvotes: 1');
                },
            );
            it(
                'should increment the downvote count for readability when downvote button is ' +
                'clicked',
                async () => {
                  await userEvent.click(screen.getByTestId('downvote-btn-0'));
                  expect(screen.getByTestId('downvote-count-0').textContent)
                      .toBe('Downvotes: 1');
                },
            );
            it(
                'should increment the upvote and downvote counts independently for different ' +
                'aspects',
                async () => {
                  await userEvent.click(screen.getByTestId('upvote-btn-0'));
                  await userEvent.click(screen.getByTestId('downvote-btn-1'));
                  expect(screen.getByTestId('upvote-count-0').textContent)
                      .toBe('Upvotes: 1');
                  expect(screen.getByTestId('downvote-count-0').textContent)
                      .toBe('Downvotes: 0');
                  expect(screen.getByTestId('upvote-count-1').textContent)
                      .toBe('Upvotes: 0');
                  expect(screen.getByTestId('downvote-count-1').textContent)
                      .toBe('Downvotes: 1');
                },
            );
            it(
                'should correctly handle multiple clicks on upvote and downvote buttons',
                async () => {
                  await userEvent.click(screen.getByTestId('upvote-btn-0'));
                  await userEvent.click(screen.getByTestId('upvote-btn-0'));
                  await userEvent.click(screen.getByTestId('downvote-btn-0'));
                  expect(screen.getByTestId('upvote-count-0').textContent)
                      .toBe('Upvotes: 2');
                  expect(screen.getByTestId('downvote-count-0').textContent)
                      .toBe('Downvotes: 1');
                },
            );
          },
      );
    },
);
