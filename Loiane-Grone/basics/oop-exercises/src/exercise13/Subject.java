package exercise13;

public class Subject {
    
    private String title;
    private double grade;

    public Subject() {}

    public Subject(String title, double grade) {
        this.title = title;
        this.grade = grade;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
