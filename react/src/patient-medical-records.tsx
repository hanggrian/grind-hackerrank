import {Dispatch, JSX, useState} from 'react';
import './patient-medical-records.css';
import {MEDICAL_RECORDS, MedicalRecord} from './patient-medical-records-data'

export default function PatientMedicalRecords(): JSX.Element {
  const [record, setRecord] = useState<MedicalRecord>();

  return (
      <>
        <div className='App'>
          <div className='content'>
            <Search setRecord={setRecord}/>
            <Records record={record} setRecord={setRecord}/>
          </div>
        </div>
      </>
  );
}

function Search({setRecord}: { setRecord: Dispatch<MedicalRecord> }): JSX.Element {
  function show() {
    const element: HTMLElement | null = document.getElementById('patient-name-select')
    if (!element || !(element instanceof HTMLSelectElement)) {
      return;
    }
    const value: number = parseInt(element.value);
    if (value === 0) {
      alert('Please select a patient name');
      return;
    }
    setRecord(MEDICAL_RECORDS[value - 1]);
  }

  return (
      <div className='layout-row align-items-baseline select-form-container'>
        <div className='select'>
          <select
              id='patient-name-select'
              data-testid='patient-name'
              defaultValue='0'>
            <option value='0' disabled>Select Patient</option>
            {
              MEDICAL_RECORDS.map((record: MedicalRecord, i: number) => (
                  <option value={i + 1} key={record.id}>{record.data[0].userName}</option>
              ))
            }
          </select>
        </div>

        <button onClick={show} type='submit' data-testid='show'>
          Show
        </button>
      </div>
  );
}

function Records(
    {record, setRecord}: { record: MedicalRecord | undefined, setRecord: Dispatch<MedicalRecord> },
): JSX.Element {
  function next() {
    if (!record) {
      return;
    }
    const id: number = parseInt(record.id) - 1;
    setRecord(MEDICAL_RECORDS[id == MEDICAL_RECORDS.length - 1 ? 0 : id + 1]);
  }

  if (!record) {
    return <></>;
  }
  const data = record.data[0];
  return (
      <div className='patient-profile-container' id='profile-view'>
        <div className='layout-row justify-content-center'>
          <div id='patient-profile' data-testid='patient-profile' className='mx-auto'>
            <h4 id='patient-name'>{data.userName}</h4>
            <h5 id='patient-dob'>DOB: {data.userDob}</h5>
            <h5 id='patient-height'>Height: {data.meta.height}</h5>
          </div>
          <button onClick={next} className='mt-10 mr-10' data-testid='next-btn'></button>
        </div>

        <table id='patient-records-table'>
          <thead id='table-header'>
          <tr>
            <th>SL</th>
            <th>Date</th>
            <th>Diagnosis</th>
            <th>Weight</th>
            <th>Doctor</th>
          </tr>
          </thead>
          <tbody id='table-body' data-testid='patient-table'>
          {
            record.data.map((data, i: number) => (
                <tr key={data.timestamp}>
                  <td>{i + 1}</td>
                  <td>
                    {
                      new Date(data.timestamp)
                          .toLocaleString(
                              'en-US',
                              {day: '2-digit', month: '2-digit', year: 'numeric'},
                          )
                    }
                  </td>
                  <td>{data.diagnosis.name}</td>
                  <td>{data.meta.weight}</td>
                  <td>{data.doctor.name}</td>
                </tr>
            ))
          }
          </tbody>
        </table>
      </div>
  );
}
