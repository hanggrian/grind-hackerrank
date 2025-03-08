import {beforeEach, describe, expect, it, MockInstance, vi} from 'vitest'
import '@testing-library/jest-dom';
import {render, screen} from '@testing-library/react';
import {userEvent} from '@testing-library/user-event';
import PetientMedicalRecords from '../src/patient-medical-records';
import {MEDICAL_RECORDS} from "../src/patient-medical-records-data";

const REGEX_DATE: RegExp = /(\d{2}\/\d{2}\/\d{4})/;

describe(
    'PetientMedicalRecords',
    () => {
      beforeEach(() => {
        render(<PetientMedicalRecords/>);
      });

      it(
          'Test Initial Loading of the App',
          () => {
            const patientName: HTMLElement = screen.getByTestId('patient-name');
            expect(screen.queryByTestId('patient-table'))
                .not.toBeInTheDocument();
            expect(screen.queryByTestId('patient-table'))
                .not.toBeInTheDocument();
            expect(screen.queryByTestId('next-btn'))
                .not.toBeInTheDocument();
            expect(patientName.children[0])
                .toHaveTextContent('Select Patient');
            expect(patientName.children[0])
                .toHaveAttribute('disabled');
            expect(patientName.children[1])
                .toHaveTextContent('John Oliver');
            expect(patientName.children[2])
                .toHaveTextContent('Bob Martin');
            expect(patientName.children[3])
                .toHaveTextContent('Helena Fernandez');
          },
      );
      it(
          'Show alert on clicking show button if no patient is selected',
          async () => {
            const alertMock: MockInstance<Window['alert']> =
                vi.spyOn(window, 'alert')
                    .mockImplementation(() => {
                    })
            await userEvent.click(screen.getByTestId('show'));
            expect(alertMock).toHaveBeenCalledWith('Please select a patient name');
          },
      );
      it(
          'Test getting patient details',
          async () => {
            await userEvent.selectOptions(screen.getByTestId('patient-name'), 'John Oliver');
            await userEvent.click(screen.getByTestId('show'));
            const patientProfile = screen.queryByTestId('patient-profile');
            const patientTable = screen.queryByTestId('patient-table');
            expect(patientProfile)
                .toBeInTheDocument();
            expect(patientTable)
                .toBeInTheDocument();
            expect(patientProfile.children[0])
                .toHaveTextContent('John Oliver');
            expect(patientProfile.children[1])
                .toHaveTextContent('DOB: 02-01-1986');
            expect(patientProfile.children[2])
                .toHaveTextContent('Height: 168');

            for (let i = 0; i < MEDICAL_RECORDS[0].data.length; i++) {
              expect(patientTable.children[i].children[0])
                  .toHaveTextContent(i + 1);
              expect(patientTable.children[i].children[1].textContent)
                  .toMatch(REGEX_DATE);
              expect(patientTable.children[i].children[2])
                  .toHaveTextContent(MEDICAL_RECORDS[0].data[i].diagnosis.name);
              expect(patientTable.children[i].children[3])
                  .toHaveTextContent(MEDICAL_RECORDS[0].data[i].meta.weight);
              expect(patientTable.children[i].children[4])
                  .toHaveTextContent(MEDICAL_RECORDS[0].data[i].doctor.name);
            }
          },
      );
      it(
          'Clicking the next button should display next patient',
          async () => {
            await userEvent.selectOptions(screen.getByTestId('patient-name'), 'John Oliver');
            await userEvent.click(screen.getByTestId('show'));
            const patientProfile = screen.queryByTestId('patient-profile');
            const patientTable = screen.queryByTestId('patient-table');
            const nextBtn = screen.queryByTestId('next-btn');
            await userEvent.click(nextBtn);
            expect(patientProfile.children[0])
                .toHaveTextContent('Bob Martin');
            expect(patientProfile.children[1])
                .toHaveTextContent('DOB: 14-09-1989');
            expect(patientProfile.children[2])
                .toHaveTextContent('Height: 174');

            for (let i = 0; i < MEDICAL_RECORDS[1].data.length; i++) {
              expect(patientTable.children[i].children[0])
                  .toHaveTextContent(i + 1);
              expect(patientTable.children[i].children[1].textContent)
                  .toMatch(REGEX_DATE);
              expect(patientTable.children[i].children[2])
                  .toHaveTextContent(MEDICAL_RECORDS[1].data[i].diagnosis.name);
              expect(patientTable.children[i].children[3])
                  .toHaveTextContent(MEDICAL_RECORDS[1].data[i].meta.weight);
              expect(patientTable.children[i].children[4])
                  .toHaveTextContent(MEDICAL_RECORDS[1].data[i].doctor.name);
            }
            await userEvent.click(nextBtn);
            await userEvent.click(nextBtn);
            expect(patientProfile.children[0])
                .toHaveTextContent('John Oliver');
            expect(patientProfile.children[1])
                .toHaveTextContent('DOB: 02-01-1986');
            expect(patientProfile.children[2])
                .toHaveTextContent('Height: 168');

            for (let i = 0; i < MEDICAL_RECORDS[0].data.length; i++) {
              expect(patientTable.children[i].children[0])
                  .toHaveTextContent(i + 1);
              expect(patientTable.children[i].children[1].textContent)
                  .toMatch(REGEX_DATE);
              expect(patientTable.children[i].children[2])
                  .toHaveTextContent(MEDICAL_RECORDS[0].data[i].diagnosis.name);
              expect(patientTable.children[i].children[3])
                  .toHaveTextContent(MEDICAL_RECORDS[0].data[i].meta.weight);
              expect(patientTable.children[i].children[4])
                  .toHaveTextContent(MEDICAL_RECORDS[0].data[i].doctor.name);
            }
          },
      );
    },
);
