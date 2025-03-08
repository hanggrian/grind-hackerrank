import {ChangeEvent, JSX, useState} from 'react';
import './react-contact-form.css';

const REGEX_NAME: RegExp = /^[a-zA-Z ]+$/;
const REGEX_EMAIL: RegExp = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;

export default function ReactContactForm(): JSX.Element {
  const [name, setName] = useState<string>('');
  const [email, setEmail] = useState<string>('');
  const [message, setMessage] = useState<string>('');
  const [submittedData, setSubmittedData] =
      useState<{ name: string, email: string, message: string } | null>(null);
  const [error, setError] = useState<string>('');

  function submit() {
    const submittedName: string = name.trim();
    const submittedEmail: string = email.trim();
    const submittedMessage: string = message.trim();
    if (submittedName.length === 0 ||
        submittedEmail.length === 0 ||
        submittedMessage.length === 0
    ) {
      setError('All fields are required.');
      return;
    }
    if (!REGEX_NAME.test(submittedName) || !REGEX_EMAIL.test(submittedEmail)) {
      setError('Improper input format.');
      return;
    }

    setSubmittedData({name, email, message});
    setName('');
    setEmail('');
    setMessage('');
    setError('');
  }

  return (
      <>
        <div className='App'>
          <h1>Contact Form</h1>
          <form onSubmit={submit}>
            <input
                type='text'
                value={name}
                onChange={(e: ChangeEvent<HTMLInputElement>) => setName(e.target.value)}
                placeholder='Name'
                data-testid='name-input'/>
            <input
                type='email'
                value={email}
                onChange={(e: ChangeEvent<HTMLInputElement>) => setEmail(e.target.value)}
                placeholder='Email'
                data-testid='email-input'/>
            <textarea
                value={message}
                onChange={(e: ChangeEvent<HTMLTextAreaElement>) => setMessage(e.target.value)}
                placeholder='Message'
                data-testid='message-input'/>
            <button type='submit' data-testid='submit-button'>Submit</button>
          </form>
          {
              error &&
              <p data-testid='error-message' className='error'>
                {error}
              </p>
          }
          {
              submittedData &&
              <div data-testid='submitted-data' className='submitted-data'>
                <h2>Submitted Information</h2>
                <p>
                  <strong>Name:</strong> {submittedData.name}
                </p>
                <p>
                  <strong>Email:</strong> {submittedData.email}
                </p>
                <p>
                  <strong>Message:</strong> {submittedData.message}
                </p>
              </div>
          }
        </div>
      </>
  );
}
