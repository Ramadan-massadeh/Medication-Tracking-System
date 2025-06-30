import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Doctor who extends Person.
 * A doctor has a specialization and a list of patients they manage.
 */
public class Doctor extends Person {
    private String specialization;
    private List<Patient> patients;

    /**
     * Constructs a Doctor with the given details.
     *
     * @param id             The doctor's unique ID.
     * @param name           The doctor's name.
     * @param age            The doctor's age.
     * @param phoneNumber    The doctor's contact number.
     * @param specialization The doctor's area of specialization.
     */
    public Doctor(String id, String name, int age, String phoneNumber, String specialization) {
        super(id, name, age, phoneNumber);
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    /**
     * Gets the specialization of the doctor.
     *
     * @return The specialization string.
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * Sets the specialization for the doctor.
     *
     * @param specialization The new specialization.
     */
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    /**
     * Gets the list of patients under this doctor.
     *
     * @return List of Patient objects.
     */
    public List<Patient> getPatients() {
        return patients;
    }

    /**
     * Adds a patient to the doctor's list.
     *
     * @param patient The patient to add.
     */
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    /**
     * Returns a string representation of the doctor.
     *
     * @return Doctor info as a string.
     */
    @Override
    public String toString() {
        return super.toString() + ", Specialization: " + specialization + ", Patients: " + patients.size();
    }
}
