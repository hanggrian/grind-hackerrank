[&larr; Return](https://hanggrian.github.io/grind-hackerrank/)

# Patient Medical Records<sup>MEDIUM</sup>

> In this challenge, you will create a React application called "Patient Medical
  Records" that allows users to view and cycle through patients' medical
  records. The application requirements are outlined below, and your finished
  implementation must pass all provided unit tests.
>
> **Detailed Requirements**
>
> 1.  The application consists of two components: Search and Records.
>     - Search: Contains a dropdown select menu and a "Show" button.
>     - Records: Displays the selected patient's records in a table and includes
        a "Next" button to navigate to the next patient's records.
> 1.  The Search component must have a dropdown select menu populated with 3
      patient names from a file named medicalRecords.js. By default, the
      dropdown should display "Select Patient" with both selected and disabled
      attributes.
> 1.  When the application is first loaded, no record table or "Next" button
      should be visible.
> 1.  Show Button Functionality:
>     - If the user clicks "Show" without selecting a patient, an alert should
        appear with the message: "Please select a patient name".
>     - If a patient is selected, clicking "Show" should display a table
        containing all of the selected patient’s details and medical records.
        The table must also include a "Next" button to navigate through records.
> 1.  Next Button Functionality:
>     - Clicking "Next" should display the medical records for the next patient
        in the list based on their ID.
>     - If the last patient's records are being displayed, clicking "Next"
        should loop back to the first patient's records.

- [Problem](https://www.hackerrank.com/challenges/patient-medical-records/)
- [Solution](https://github.com/hanggrian/grind-hackerrank/blob/main/react/src/patient-medical-records.tsx)
