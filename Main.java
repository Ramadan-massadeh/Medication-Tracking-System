public class Main {
    public static void main(String[] args) {
        MedicationTracking system = new MedicationTracking();


        Doctor doc1 = new Doctor("Ahmad");
        Patient patient1 = new Patient("Ali");
        Medication med1 = new Medication("Panadol", 10);

        system.addDoctor(doc1);
        system.addPatient(patient1);
        system.addMedication(med1);


        system.addPatientToDoctor(doc1, patient1);

      
        Prescription prescription1 = new Prescription(1, doc1, patient1, med1);
        system.acceptPrescription(prescription1);

       
        system.searchDoctorByName("Dr. Ahmad");
        system.searchPatientByName("Ali");
        system.searchMedicationByName("Panadol");

       
        system.editPatientName("Ali", "Omar");

       
        system.deleteDoctorByName("Dr. Ahmad");

      
        system.generateReport();

    
        system.checkForExpiredMedications();

        system.printPrescriptionsByDoctor("Dr. Ahmad");


        system.restockMedications(5);
    }
}