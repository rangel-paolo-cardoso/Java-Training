import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a grade between 0 and 10: ");
        int grade = sc.nextInt();

        while (grade < 0 || grade > 10) {
            System.out.println("Invalid vallue!");
            System.out.print("Enter the grade again: ");
            grade = sc.nextInt();
        }

        System.out.println("The grade is " + grade);

        sc.close();
    }
}
