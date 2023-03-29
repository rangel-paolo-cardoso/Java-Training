package exercise23;

public class Student {

    private String name;
    private int registration;

    private double[] grades;

    public Student() {
    }

    public Student(String name, int registration, double[] grades) {
        this.name = name;
        this.registration = registration;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegistration() {
        return registration;
    }

    public double calculateAverage() {
        double average = 0.0;
        for (double grade : this.grades) {
            average += grade;
        }
        return average / grades.length;
    }

    public String getFormatedGrades() {
        StringBuilder gradesString = new StringBuilder();
        for (int i = 0; i < this.grades.length; i += 1) {
            gradesString.append("\nGrade ");
            gradesString.append((i +  1));
            gradesString.append(": ");
            gradesString.append(this.grades[i]);
        }
        return gradesString.toString();
    }

    public void printInfo() {
        double average = calculateAverage();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: " + this.name);
        stringBuilder.append(",\nRegistration: " + this.registration);
        stringBuilder.append(getFormatedGrades());
        stringBuilder.append("\nFinal average: ");
        stringBuilder.append(average);
        stringBuilder.append("\n");
        stringBuilder.append("Status: ");
        stringBuilder.append((average) >= 7 ? "Passed": "Failed");
        stringBuilder.append("\n");
        System.out.println(stringBuilder.toString());
    }
}
