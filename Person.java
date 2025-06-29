public class Person {
    private static int nextId = 1; // counter to initialize unique ID numbers
    private int id;
    private String name;
    private int age;
    private String phoneNumber;

    // constructor
    public Person(String name, int age, String phoneNumber) {
        this.id = nextId++; // assign and increment
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // to get person ID
    public int getId() {
        return id;
    }

    // to get name of person
    public String getName() {
        return name;
    }

    // to set name of person
    public void setName(String name) {
        this.name = name;
    }

    // to get age of person
    public int getAge() {
        return age;
    }

    // to set age of person
    public void setAge(int age) {
        this.age = age;
    }

    // to get phone number of person
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // to set phone number of person
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // custom strong for Person object
    @Override
    public String toString() {
        return "Person[ID=" + id + ", Name=" + name + ", Age=" + age + ", Phone=" + phoneNumber + "]";
    }
}
