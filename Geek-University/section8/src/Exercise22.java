import java.util.Locale;
import java.util.Scanner;

public class Exercise22 {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a whole number : ");
        int number = sc.nextInt();

        generateExclamationMarks(number);

        sc.close();
    }

    static void generateExclamationMarks(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("!");
            }
            System.out.println();
        }
    }
}
