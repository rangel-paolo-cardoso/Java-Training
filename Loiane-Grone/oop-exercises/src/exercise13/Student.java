package exercise13;

public class Student {

    private int registration;
    private String name;
    private String course;
    private Subject[] subjects = new Subject[3];

    public Student() {}

    public Student(int registration, String name, String course) {
        this.registration = registration;
        this.name = name;
        this.course = course;
    }

    boolean checkIfApprovedInASubject(String subjectName) {
        boolean approved = false;
        for (Subject subject : subjects) {
            if (subject.getTitle().equals(subjectName)) {
                if (subject.getGrade() >= 7) {
                    approved = true;
                }
            }
        }
        return approved;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Subject[] getSubjects() {
        return subjects;
    }
}
