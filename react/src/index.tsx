import {StrictMode} from 'react';
import {createRoot} from 'react-dom/client';
import BlogPost from "./blog-post.tsx";

createRoot(document.getElementById('root')!).render(
    <StrictMode>
      <BlogPost/>
    </StrictMode>
);
