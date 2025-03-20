import {beforeEach, describe, expect, it} from 'vitest'
import '@testing-library/jest-dom';
import {render, screen, within} from '@testing-library/react';
import {userEvent} from '@testing-library/user-event';
import ReactArticleSorting from '../src/react-article-sorting';
import {Article, ARTICLES} from '../src/react-article-sorting-data';

describe(
    'ReactArticleSorting',
    () => {
      beforeEach(() => render(<ReactArticleSorting articles={ARTICLES}/>));

      const testIds = {
        mostUpvotedLink: 'most-upvoted-link',
        mostRecentLink: 'most-recent-link',
        article: 'article',
      };
      const mostUpvotedArticles: Article[] =
          ARTICLES
              .concat()
              .sort((a: Article, b: Article) => b.upvotes - a.upvotes);
      const mostRecentArticles: Article[] =
          ARTICLES
              .concat()
              .sort((a: Article, b: Article) =>
                  new Date(b.date).getTime() - new Date(a.date).getTime(),
              );

      function expectArticles(articles: Article[], expectedArticles: Article[]) {
        expect(articles.length).toBe(expectedArticles.length);
        articles.forEach((article: Article, i: number) => {
          const title: string = within(article).getByTestId('article-title').textContent;
          const upvotes: string = within(article).getByTestId('article-upvotes').textContent;
          const date: string = within(article).getByTestId('article-date').textContent;
          const expectedArticle: Article = expectedArticles[i];
          expect([title, upvotes, date]).toEqual([
            expectedArticle.title,
            expectedArticle.upvotes.toString(),
            expectedArticle.date,
          ]);
        });
      }

      it(
          'Initial articles render correctly',
          () =>
              expectArticles(
                  screen.queryAllByTestId(testIds.article),
                  mostUpvotedArticles,
              ),
      );
      it(
          'Clicking on top renders expected articles',
          async () => {
            await userEvent.click(screen.getByTestId(testIds.mostUpvotedLink));
            expectArticles(
                screen.queryAllByTestId(testIds.article),
                mostUpvotedArticles,
            );
          },
      );
      it(
          'Clicking on newest renders expected articles',
          async () => {
            await userEvent.click(screen.getByTestId(testIds.mostRecentLink));
            expectArticles(
                screen.queryAllByTestId(testIds.article),
                mostRecentArticles,
            );
          },
      );
      it(
          'Sequence of navigation clicks renders expected articles',
          async () => {
            const mostUpvotedLink: HTMLElement = screen.getByTestId(testIds.mostUpvotedLink);
            const mostRecentLink: HTMLElement = screen.getByTestId(testIds.mostRecentLink);
            for (const elem of [
              mostRecentLink,
              mostUpvotedLink,
              mostUpvotedLink,
              mostRecentLink,
              mostRecentLink,
              mostUpvotedLink,
            ]) {
              await userEvent.click(elem);
              expectArticles(
                  screen.queryAllByTestId(testIds.article),
                  elem === mostUpvotedLink
                      ? mostUpvotedArticles
                      : mostRecentArticles,
              );
            }
          },
      );
    },
);
