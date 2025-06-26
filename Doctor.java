import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void addPatient(Patient p) {
    patients.add(p);
}

    public void setName(String name) {
        this.name = name;
    }
}