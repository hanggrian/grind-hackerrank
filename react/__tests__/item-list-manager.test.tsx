import {describe, expect, it} from 'vitest'
import '@testing-library/jest-dom';
import {render, screen, within} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import ItemListManager from '../src/item-list-manager';

describe(
    'ItemListManager',
    () => {
      it(
          'Sample interaction',
          async () => {
            render(<ItemListManager/>);

            await assertEmpty();

            await insertItem('First Item');
            await clickAdd();
            assertContains('First Item');

            await insertItem('Second Item');
            await clickAdd();
            assertContains('Second Item');
          }
      )
      it(
          'Skip empty entry',
          async () => {
            render(<ItemListManager/>);

            await clickAdd();
            await assertEmpty();

            await clickAdd();
            await insertItem(' ');
            await assertEmpty();
          }
      )
    }
)

async function assertEmpty() {
  expect(
      within(
          await screen.findByTestId('item-list'))
          .queryAllByRole('list-item')
          .length,
  ).toBe(0);
}

async function assertContains(item: string) {
  expect(await screen.findByTestId('item-list'))
      .toHaveTextContent(item);
}

async function insertItem(item: string) {
  await userEvent.type(await screen.findByTestId('input-field'), item);
}

async function clickAdd() {
  await userEvent.click(await screen.findByTestId('add-button'));
}
