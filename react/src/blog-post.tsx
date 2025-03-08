import {ChangeEvent, Dispatch, JSX, SetStateAction, useState} from 'react';
import './blog-post.css';

type Post = {
  title: string,
  description: string,
}

export default function BlogPost(): JSX.Element {
  return (
      <div className='App'>
        <Home/>
      </div>
  );
}

function Home(): JSX.Element {
  const [posts, setPosts] = useState<Post[]>([]);
  const [title, setTitle] = useState<string>('');
  const [description, setDescription] = useState<string>('');

  function createPost() {
    const postTitle: string = title.trim();
    const postDescription: string = description.trim();
    if (postTitle.length === 0 || postDescription.length === 0) {
      return;
    }

    setPosts((prevData: Post[]) =>
        [
          ...prevData,
          {
            title: postTitle,
            description: postDescription,
          },
        ],
    );
    setTitle('');
    setDescription('');
  }

  return (
      <div className='text-center ma-20'>
        <div className='mb-20'>
          <Input
              title={title}
              setTitle={setTitle}
              description={description}
              setDescription={setDescription}/>
          <button
              onClick={createPost}
              data-testid='create-button'
              className='mt-10'>
            Create Post
          </button>
        </div>
        <div className='posts-section'>
          <PostDisplay
              posts={posts}
              setPosts={setPosts}/>
        </div>
      </div>
  );
}

function Input(
    {title, setTitle, description, setDescription}: {
      title: string,
      setTitle: Dispatch<string>,
      description: string,
      setDescription: Dispatch<string>,
    },
): JSX.Element {
  return (
      <div className='layout-column justify-content-center align-items-center'>
        <input
            className='w-100'
            type='text'
            placeholder='Enter Title'
            value={title}
            onChange={(e: ChangeEvent<HTMLInputElement>) => setTitle(e.target.value)}
            data-testid='title-input'/>
        <textarea
            className='mt-10 w-100'
            placeholder='Enter Description'
            value={description}
            onChange={(e: ChangeEvent<HTMLTextAreaElement>) => setDescription(e.target.value)}
            data-testid='description-input'/>
      </div>
  );
}

function PostDisplay(
    {posts, setPosts}: { posts: Post[], setPosts: Dispatch<SetStateAction<Post[]>> },
): JSX.Element {
  function deletePost(index: number) {
    setPosts((prevData: Post[]) => prevData.filter((_, i) => index !== i));
  }

  return (
      <div data-testid='posts-container' className='flex wrap gap-10'>
        {
            posts &&
            posts.map((post: Post, i: number) =>
                <div className="post-box" key={i}>
                  <h3>{post.title}</h3>
                  <p>{post.description}</p>
                  <button onClick={() => deletePost(i)}>Delete</button>
                </div>
            )
        }
      </div>
  );
}
