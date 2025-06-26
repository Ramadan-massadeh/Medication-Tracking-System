// ================================
// Author: Ramadan Masadekh
// Date: June 25, 2025
// ================================

import java.time.LocalDate;

public class Prescription {

    private int id;
    private Doctor doctor;
    private Patient patient;
    private Medication medication;
    private LocalDate expiryDate; 

    public Prescription(int id, Doctor doctor, Patient patient, Medication medication) {
    this.id = id;
    this.doctor = doctor;
    this.patient = patient;
    this.medication = medication;
    this.expiryDate = LocalDate.now().plusYears(1); 
    }

    public int getId() {
        return id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public Medication getMedication() {
        return medication;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }
    public String toString() {
        return "Prescription ID: " + id +"\nDoctor: "
         + doctor.getName() +"\nPatient: " + patient.getName() +"\nMedication: " + medication.getName()
         +"\nExpires on: " + expiryDate;
    }
}