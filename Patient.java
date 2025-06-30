import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {
    private List<String> medications;
    private List<String> prescriptions;

    // constructor
  public Patient(String id, String name, int age, String phoneNumber) {
    super(id, name, age, phoneNumber);
    this.medications = new ArrayList<>();
    this.prescriptions = new ArrayList<>();
}

    // to add medications to patient profile
    public void addMedication(String medication) {
        medications.add(medication);
    }

    // to remove medications from patient profile
    public void removeMedication(String medication) {
        medications.remove(medication);
    }

    // to replace all medication on profile with a new list of medication
    public void setMedications(List<String> medications) {
        this.medications = new ArrayList<>(medications);
    }

    // to get list of medications
    public List<String> getMedications() {
        return new ArrayList<>(medications);
    }

    // to add new prescription
    public void addPrescription(String prescription) {
        prescriptions.add(prescription);
    }

    // to remove individual prescription
    public void removePrescription(String prescription) {
        prescriptions.remove(prescription);
    }

    // to replace entire list of prescriptions with a new list of prescriptions
    public void setPrescriptions(List<String> prescriptions) {
        this.prescriptions = new ArrayList<>(prescriptions);
    }

    // to get prescriptions
    public List<String> getPrescriptions() {
        return new ArrayList<>(prescriptions);
    }

    // custom string to print medications and prescriptions associated with patient
    @Override
    public String toString() {
        return super.toString() +
                ", Medications=" + medications +
                ", Prescriptions=" + prescriptions;
    }
}
