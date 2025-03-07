import {StrictMode} from 'react'
import {createRoot} from 'react-dom/client'
import './index.css'
import ItemListManager from './item-list-manager';

createRoot(document.getElementById('root')!).render(
    <StrictMode>
      <ItemListManager/>
    </StrictMode>,
)
