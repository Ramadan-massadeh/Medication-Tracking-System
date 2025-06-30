/*
Author: Ramadan Masadekh
Date: June 25, 2025
*/

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        MedicationTracking system = new MedicationTracking();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("===== Welcome To The Pharmacy Med Tracking System =====");
            System.out.println("1: Add A New Patient");
            System.out.println("2: Add A New Doctor");
            System.out.println("3: Add A New Medication To The Pharmacy");
            System.out.println("4: Print System Report");
            System.out.println("5: Check If Meds Are Expired");
            System.out.println("6: Process A New Prescription");
            System.out.println("7: Print All Scripts For Specific Doctor");
            System.out.println("8: Restock the drugs in the pharmacy");
            System.out.println("9: Exit");
            System.out.print("Enter your choice: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1 -> addANewPatient(scanner, system);
                case 2 -> addANewDoctor(scanner, system);
                case 3 -> addNewMedication(scanner, system);
                case 4 -> system.generateReport();
                case 5 -> system.checkForExpiredMedications();
                case 6 -> processNewPrescription(scanner, system);
                case 7 -> printScriptsByDoctor(scanner, system);
                case 8 -> restockDrugs(scanner, system);
                case 9 -> {
                    System.out.println("Exiting... Goodbye!");
                    exit = true;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addANewPatient(Scanner scanner, MedicationTracking system) {
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        System.out.print("Enter patient age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter patient phone: ");
        String phone = scanner.nextLine();

        String id = "P" + System.currentTimeMillis();
        system.addPatient(new Patient(id, name, age, phone));
        System.out.println("Patient added successfully.\n");
    }

    private static void addANewDoctor(Scanner scanner, MedicationTracking system) {
        System.out.print("Enter doctor name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter specialization: ");
        String spec = scanner.nextLine();

        
        String id = "D" + System.currentTimeMillis();
        system.addDoctor(new Doctor(id, name, age, phone, spec));
        System.out.println("Doctor added successfully.\n");
    }

    private static void addNewMedication(Scanner scanner, MedicationTracking system) {
        System.out.print("Enter medication ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter dose: ");
        String dose = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int qty = scanner.nextInt();
        scanner.nextLine();

        system.addMedication(new Medication(id, name, dose, qty));
        System.out.println("Medication added.\n");
    }

    private static void processNewPrescription(Scanner scanner, MedicationTracking system) {
        System.out.print("Enter Prescription ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Doctor Name: ");
        String docName = scanner.nextLine();
        System.out.print("Enter Patient Name: ");
        String patName = scanner.nextLine();
        System.out.print("Enter Medication Name: ");
        String medName = scanner.nextLine();

        Doctor doc = system.findDoctorByName(docName);
        Patient pat = system.findPatientByName(patName);
        Medication med = system.findMedicationByName(medName);

        if (doc != null && pat != null && med != null) {
            Prescription p = new Prescription(id, doc, pat, med);
            system.acceptPrescription(p);
        } else {
            System.out.println("Invalid data. Check entries.\n");
        }
    }

    private static void printScriptsByDoctor(Scanner scanner, MedicationTracking system) {
        System.out.print("Enter doctor name: ");
        String name = scanner.nextLine();
        system.printPrescriptionsByDoctor(name);
    }

    private static void restockDrugs(Scanner scanner, MedicationTracking system) {
        System.out.print("Enter quantity to restock: ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        system.restockMedications(amount);
    }
}