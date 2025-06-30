# Medication-Tracking-System

# Pharmacy Medication Tracking System

## Project Description

This is a small project for tracking medications in a pharmacy. The system allows me to add doctors, patients, and medications. I can also accept prescriptions, search by name, edit and delete data, and print a full report.

## Classes & What They Do

### 1. **Patient**

- Stores patient name, age, and phone number.

### 2. **Doctor**

- Stores doctor name, age, phone, and specialization.
- Can have a list of patients.

### 3. **Medication**

- Stores medication name, dose, and quantity in stock.

### 4. **Prescription**

- Has an ID, doctor, patient, medication, and expiry date (default is one year from today).

### 5. **MedicationTracking**

- This class manages everything.
- It has lists for patients, doctors, medications, and prescriptions.
- It contains all the functions like search, add, delete, edit, check expiry, generate report, etc.

### 6. **MainMenu**

- This class runs the program.
- It shows the user a menu to choose what they want to do.

## How to Run

- Run `MainMenu.java`
- Follow the menu options like:
  - 1: Add a new patient
  - 2: Add a new doctor
  - 3: Add new medication
  - 4: Print report
  - 5: Check expired meds
  - 6: Add new prescription
  - 7: Show prescriptions by doctor
  - 8: Restock medications

## Features

- Search by name for patient, doctor, or medication.
- Add patients to a doctor.
- Accept and store prescriptions.
- Edit or delete patients, doctors, or meds.
- Print a full system report.
- Check for expired prescriptions.
- Show all prescriptions by a doctor.
- Restock meds (increase quantity).

## Link for video documentation/presentation

https://drive.google.com/file/d/1RJpWieqFi0KKh8IBi1h0UNQy5UT3eLlj/view?usp=drive_link

## Date

June 2025
