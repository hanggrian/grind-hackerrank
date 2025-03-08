import {JSX, useState} from 'react';
import './react-article-sorting.css';
import {Article} from './react-article-sorting-data'

export default function ReactArticleSorting({articles}: { articles: Article[] }): JSX.Element {
  const getMostUpvotedArticles =
      (list: Article[]) => list.sort((a, b) => b.upvotes - a.upvotes);

  const [actualArticles, setActualArticles] =
      useState<Article[]>(getMostUpvotedArticles(articles));

  function handleMostUpvoted() {
    const temp: Article[] = [];
    Object.assign(temp, actualArticles);
    setActualArticles(getMostUpvotedArticles(temp));
  }

  function handleMostRecent() {
    const temp: Article[] = [];
    Object.assign(temp, actualArticles);
    setActualArticles(temp.sort((a, b) => new Date(b.date).getTime() - new Date(a.date).getTime()));
  }

  return (
      <>
        <div className='App'>
          <div className='layout-row align-items-center justify-content-center my-20 navigation'>
            <label className='form-hint mb-0 text-uppercase font-weight-light'>
              Sort By
            </label>
            <button
                data-testid='most-upvoted-link'
                className='small'
                onClick={handleMostUpvoted}>
              Most Upvoted
            </button>
            <button
                data-testid='most-recent-link'
                className='small'
                onClick={handleMostRecent}>
              Most Recent
            </button>
          </div>
          <Articles articles={actualArticles}/>
        </div>
      </>
  );
}

function Articles({articles}: { articles: Article[] }): JSX.Element {
  return (
      <div className='card w-50 mx-auto'>
        <table>
          <thead>
          <tr>
            <th>Title</th>
            <th>Upvotes</th>
            <th>Date</th>
          </tr>
          </thead>
          <tbody>
          {
            articles.map((article, index) => {
              return (
                  <tr data-testid='article' key={index}>
                    <td data-testid='article-title'>{article.title}</td>
                    <td data-testid='article-upvotes'>{article.upvotes}</td>
                    <td data-testid='article-date'>{article.date}</td>
                  </tr>
              );
            })
          }
          </tbody>
        </table>
      </div>
  );
}
