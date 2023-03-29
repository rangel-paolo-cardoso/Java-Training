import java.util.Locale;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first grade of the semester: ");
        double grade1 = sc.nextDouble();

        System.out.print("Enter the second grade of the semester: ");
        double grade2 = sc.nextDouble();
        double average = (grade1 + grade2) / 2;
        String concept = "";
        String status = "";

        if (average < 4.0) {
            concept = "E";
        } else if (average < 6.0) {
            concept = "D";
        } else if (average < 7.5) {
            concept = "C";
        } else if (average < 9.0) {
            concept = "B";
        } else {
            concept = "A";
        }

        switch (concept) {
            case "A":
            case "B":
            case "C":
                status = "PASSED";
                break;
            case "D":
            case "E":
                status = "FAILED";
                break;
        }

        System.out.println("Grade 1: " + grade1);
        System.out.println("Grade 2: " + grade2);
        System.out.println("Average: " + String.format("%.2f", average));
        System.out.println("Concept: " + concept);
        System.out.println("Status: " + status);

        sc.close();
    }
}
