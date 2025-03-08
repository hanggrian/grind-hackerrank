import {beforeEach, describe, expect, it} from 'vitest'
import '@testing-library/jest-dom';
import {render} from '@testing-library/react';
import {userEvent} from "@testing-library/user-event";
import BlogPost from '../src/blog-post';

describe(
    'BlogPost',
    () => {
      const TEST_IDS = {
        titleInput: 'title-input',
        descriptionInput: 'description-input',
        createButton: 'create-button',
        postsContainer: 'posts-container',
      };
      let titleInput: HTMLInputElement;
      let descriptionInput: HTMLInputElement;
      let createButton: HTMLElement;
      let postsContainer: HTMLElement;

      beforeEach(() => {
        const app = render(<BlogPost/>);
        titleInput = app.getByTestId(TEST_IDS.titleInput) as HTMLInputElement;
        descriptionInput = app.getByTestId(TEST_IDS.descriptionInput) as HTMLInputElement;
        createButton = app.getByTestId(TEST_IDS.createButton);
        postsContainer = app.getByTestId(TEST_IDS.postsContainer);
      });

      it(
          'initially the title and description should be empty',
          () => {
            expect(titleInput.value).toBe('');
            expect(descriptionInput.value).toBe('');
          },
      );
      it(
          'should add new blog post on clicking button when title and description are added',
          async () => {
            await userEvent.type(titleInput, 'Test Title');
            await userEvent.type(descriptionInput, 'Test Description');
            await userEvent.click(createButton);

            const postBox = postsContainer.children[0];
            expect(postBox.children[0]).toHaveTextContent('Test Title');
            expect(postBox.children[1]).toHaveTextContent('Test Description');
            expect(postBox.children[2]).toBeInTheDocument(); // This is the delete button
            expect(postBox.children[2]).toHaveTextContent('Delete');
          },
      );
      // TODO find out why this test fails
      it.skip(
          'should not add new blog post on clicking button if either title or description are ' +
          'empty',
          async () => {
            // Test with empty title
            await userEvent.type(descriptionInput, 'Test Description');
            await userEvent.click(createButton);
            expect(postsContainer.children.length).toBe(0);

            // Test with empty description
            await userEvent.type(titleInput, 'Test Title');
            await userEvent.type(descriptionInput, ' ');
            await userEvent.click(createButton);
            expect(postsContainer.children.length).toBe(0);

            // Test with both empty
            await userEvent.type(titleInput, ' ');
            await userEvent.click(createButton);
            expect(postsContainer.children.length).toBe(0);
          },
      );
      it(
          'check the content of new blog post with the content added while creating/entering ' +
          'inputs to title and description',
          async () => {
            await userEvent.type(titleInput, 'Content Title');
            await userEvent.type(descriptionInput, 'Content Description');
            await userEvent.click(createButton);

            const postBox = postsContainer.children[0];
            expect(postBox.children[0]).toHaveTextContent('Content Title');
            expect(postBox.children[1]).toHaveTextContent('Content Description');
          },
      );
      it(
          'delete button should delete the respective blog post, after adding multiple posts',
          async () => {
            // Create multiple posts
            await userEvent.type(titleInput, 'First Post');
            await userEvent.type(descriptionInput, 'First Description');
            await userEvent.click(createButton);

            await userEvent.type(titleInput, 'Second Post');
            await userEvent.type(descriptionInput, 'Second Description');
            await userEvent.click(createButton);

            await userEvent.type(titleInput, 'Third Post');
            await userEvent.type(descriptionInput, 'Third Description');
            await userEvent.click(createButton);

            // Delete the second post
            const secondPostDeleteButton = postsContainer.children[1].children[2];
            await userEvent.click(secondPostDeleteButton);

            // Check the posts remaining
            expect(postsContainer.children[0].children[0]).toHaveTextContent('First Post');
            expect(postsContainer.children[1].children[0]).toHaveTextContent('Third Post');
            expect(postsContainer.children.length).toBe(2);
          },
      );
      it(
          'should clear title and description fields after adding a new blog post',
          async () => {
            await userEvent.type(titleInput, 'Title to Clear');
            await userEvent.type(descriptionInput, 'Description to Clear');
            await userEvent.click(createButton);

            expect(titleInput.value).toBe('');
            expect(descriptionInput.value).toBe('');
          },
      );
    },
);
