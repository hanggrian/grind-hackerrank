import {JSX, useState} from 'react';
import './code-review-feedback.css';

export default function CodeReviewFeedback(): JSX.Element {
  const CATEGORIES: string[] = [
    'Readability',
    'Performance',
    'Security',
    'Documentation',
    'Testing',
  ];

  return (
      <>
        <div className='App'>
          <div className='my-0 mx-auto text-center w-mx-1200'>
            <div className='flex wrap justify-content-center mt-30 gap-30'>
              {CATEGORIES.map((category, i) => Card(category, i))}
            </div>
          </div>
        </div>
      </>
  );
}

function Card(title: string, index: number): JSX.Element {
  const [upvotes, setUpvotes] = useState<number>(0);
  const [downvotes, setDownvotes] = useState<number>(0);

  function vote(increment: boolean = true) {
    if (increment) {
      setUpvotes(prevUpvotes => prevUpvotes + 1);
      return;
    }
    setDownvotes(prevDownvotes => prevDownvotes + 1);
  }

  return (
      <div className='pa-10 w-300 card'>
        <h2>{title}</h2>
        <div className='flex my-30 mx-0 justify-content-around'>
          <button
              onClick={() => vote()}
              className='py-10 px-15'
              data-testid={'upvote-btn-' + index}>
            👍 Upvote
          </button>
          <button
              onClick={() => vote(false)}
              className='py-10 px-15 danger'
              data-testid={'downvote-btn-' + index}>
            👎 Downvote
          </button>
        </div>
        <p className='my-10 mx-0' data-testid={'upvote-count-' + index}>
          Upvotes: <strong>{upvotes}</strong>
        </p>
        <p className='my-10 mx-0' data-testid={'downvote-count-' + index}>
          Downvotes: <strong>{downvotes}</strong>
        </p>
      </div>
  );
}
