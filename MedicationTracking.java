import java.time.LocalDate;
import java.util.*;

public class MedicationTracking {

 private List<Doctor> doctors;
    private List<Patient> patients;
    private List<Medication> medications;
    private List<Prescription> prescriptions;

    public MedicationTracking() {
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
        medications = new ArrayList<>();
        prescriptions = new ArrayList<>();
    }
    public Doctor findDoctorByName(String name) {
        for (Doctor d : doctors) {
            if (d.getName().equalsIgnoreCase(name)) {
                return d;
            }
        }
        return null;
    }

    public Patient findPatientByName(String name) {
        for (Patient p : patients) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public Medication findMedicationByName(String name) {
        for (Medication m : medications) {
            if (m.getName().equalsIgnoreCase(name)) {
                return m;
            }
        }
        return null;
    }

    // •	Search for drugs, patients, and doctors by name and display relevant details for each

public void searchDoctorByName(String name) {
    Doctor doctor = findDoctorByName(name);
    if (doctor != null) {
        System.out.println(doctor.toString());
    } else {
        System.out.println("Doctor not found.");
    }
}

 public void searchPatientByName(String name) {
    Patient patient = findPatientByName(name);
    if (patient != null) {
        System.out.println(patient.toString());
    } else {
        System.out.println("Patient not found.");
    }
}
public void searchMedicationByName(String name) {
    Medication medication = findMedicationByName(name);
    if (medication != null) {
        System.out.println(medication.toString());
    } else {
        System.out.println("Medication not found.");
    }
}

// •	Add a patient to a doctor's list.

public void addPatientToDoctor(Doctor doctor, Patient patient) {
    if (doctor != null && patient != null) {
        doctor.addPatient(patient);
        System.out.println("Patient " + patient.getName() + " added to Dr. " + doctor.getName());
    } else {
        System.out.println("Null");
    }
}

// •	Accept a prescription (staff manually inputs the prescription details from the doctor), linking the prescription and drug to the patient.

public void acceptPrescription(Prescription prescription) {
    if (prescription != null) {
        prescriptions.add(prescription);
        System.out.println("Prescription added for patient: " + prescription.getPatient().getName());
    } else {
        System.out.println("Null prescription.");
    }
}


// Edit and delete medication function


public void editMedicationName(String Oname, String Nname) {
    for (int i = 0; i < medications.size(); i++) {
        Medication med = medications.get(i);
        if (med.getName().equals(Oname)) {
            med.setName(Nname);
            System.out.println("Updated");
            return;
        }
    }

    System.out.println("Not found");
}

public void deleteMedicationByName(String name) {
    for (int i = 0; i < medications.size(); i++) {
        Medication med = medications.get(i);
        if (med.getName().equals(name)) {
            medications.remove(i);
            System.out.println("Removed");
            return;
        }
    }

    System.out.println("Not found");
}

// Edit and delete Patient function

public void editPatientName(String oldName, String newName) {
    for (int i = 0; i < patients.size(); i++) {
        Patient pat = patients.get(i);
        if (pat.getName().equals(oldName)) {
            pat.setName(newName);
            System.out.println("Updated");
            return;
        }
    }

    System.out.println("Not found");
}

public void deletePatientByName(String name) {
    for (int i = 0; i < patients.size(); i++) {
        Patient pat = patients.get(i);
        if (pat.getName().equals(name)) {
            patients.remove(i);
            System.out.println("Removed");
            return;
        }
    }

    System.out.println("Not found");
}


// Edit and delete Doctor function

public void editDoctorName(String oldName, String newName) {
    for (int i = 0; i < doctors.size(); i++) {
        Doctor doc = doctors.get(i);
        if (doc.getName().equals(oldName)) {
            doc.setName(newName);
            System.out.println("Updated");
            return;
        }
    }

    System.out.println("Not found");
}

public void deleteDoctorByName(String name) {
    for (int i = 0; i < doctors.size(); i++) {
        Doctor d = doctors.get(i);
        if (d.getName().equals(name)) {
            doctors.remove(i);
            System.out.println("Removed");
            return;
        }
    }

    System.out.println("Not found");
}


// •	Generate a report containing all system data, including drugs, patients, doctors, and prescriptions.

public void generateReport() {
    System.out.println("------ SYSTEM REPORT ------");

    System.out.println("\n *** Medications *** ");
    for (int i = 0; i < medications.size(); i++) {
        Medication med = medications.get(i);
        System.out.println("Name: " + med.getName() + ", Quantity: " + med.getQuantityInStock());
    }

    System.out.println("\n*** Patients ***");
    for (int i = 0; i < patients.size(); i++) {
        Patient pat = patients.get(i);
        System.out.println("Name: " + pat.getName());
    }

    System.out.println("\n*** Doctors *** ");
    for (int i = 0; i < doctors.size(); i++) {
        Doctor doc = doctors.get(i);
        System.out.println("Name: " + doc.getName());
    }

    System.out.println("\n*** Prescriptions ***");
    for (int i = 0; i < prescriptions.size(); i++) {
        Prescription pres = prescriptions.get(i);
        System.out.println(pres.toString()); 
    }

    System.out.println("\n------ END OF REPORT ------");
}

//•	Check for expired medications and display a message if any are found.

public void checkForExpiredMedications() {
   

    for (int i = 0; i < prescriptions.size(); i++) {
        Prescription pres = prescriptions.get(i);
        if (pres.getExpiryDate().isBefore(LocalDate.now()) || pres.getExpiryDate().isEqual(LocalDate.now())) {
            System.out.println("Expired prescription found:");
            System.out.println(pres.toString());
          
        }
    }
  
}


//•	Print a list of all prescription’s issued by a specific doctor. 

public void printPrescriptionsByDoctor(String doctorName) {
   

    for (int i = 0; i < prescriptions.size(); i++) {
        Prescription pres = prescriptions.get(i);
        if (pres.getDoctor().getName().equals(doctorName)) {
            System.out.println(pres.toString());
      
        }
    }

 
}


// •	Restock the drugs in the pharmacy in some capacity. You can just add a random number to the stock, you can add a specific number. Its up to you!

public void restockMedications(int amount) {
    for (int i = 0; i < medications.size(); i++) {
        Medication med = medications.get(i);
       int OlQty = med.getQuantityInStock();
        med.setQuantityInStock(OlQty + amount);
    }

    System.out.println("All medications restocked by " + amount);
}


public void addDoctor(Doctor doctor) {
    doctors.add(doctor);
}


public void addPatient(Patient patient) {
    patients.add(patient);
}

public void addMedication(Medication medication) {
    medications.add(medication);
}








}