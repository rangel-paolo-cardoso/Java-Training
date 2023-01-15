import java.util.Locale;
import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of classes: ");
        int numberOfClasses = sc.nextInt();
        double averageOfStudents = 0.0;

        for (int count = 1; count <= numberOfClasses; count += 1) {
            System.out.println("How many students for the " + count + "º class?");
            int numberOfStudents = sc.nextInt();
            while (numberOfStudents > 40) {
                System.out.println("The class must not have more then 40 students!");
                System.out.println("Reenter the number of students: ");
                numberOfStudents = sc.nextInt();
            }
            averageOfStudents += numberOfStudents;
        }

        averageOfStudents /= numberOfClasses;
        System.out.println("The average number of  students per class is " + averageOfStudents);

        sc.close();
    }
}
