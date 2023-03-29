import java.util.Locale;
import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many grades do you want to enter? ");
        int amountOfGrades = sc.nextInt();
        double average = 0.0;

        for (int count = 1; count <= amountOfGrades; count += 1) {
            System.out.print("Enter the " + count + "º grade: ");
            double grade = sc.nextDouble();
            average += grade;
        }

        average /= amountOfGrades;

        System.out.println("The average is " +  average);

        sc.close();
    }
}
