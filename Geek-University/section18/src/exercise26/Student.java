package exercise26;

public class Student {

    private int registration;
    private String lastName;
    private short yearOfBirth;

    public Student() {}

    public Student(int registration, String lastName, short yearOfBirth) {
        this.registration = registration;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public short getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(short yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
