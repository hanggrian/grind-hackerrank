import {ChangeEvent, useState} from 'react';
import './item-list-manager.css';

export default function ItemListManager() {
  const [items, setItems] = useState<string[]>([]);
  const [input, setInput] = useState<string>('');

  const handleAddItem: () => void =
      () => {
        const s = input.trim();
        if (!s) {
          return
        }
        setItems((prevData: string[]) => [...prevData, s]);
        setInput('');
      };

  return (
      <>
        <div className='App'>
          <h3>Item List</h3>
          <input
              type='text'
              value={input}
              onChange={(e: ChangeEvent<HTMLInputElement>) => setInput(e.target.value)}
              placeholder='Enter item'
              data-testid='input-field'/>
          <button onClick={handleAddItem} data-testid='add-button'>Add Item</button>
          <ul data-testid='item-list'>
            {items.map((item, index) => (
                <li key={index} data-testid='list-item'>{item}</li>
            ))}
          </ul>
        </div>
      </>
  );
}
