import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[3][3];
        int amountOfEvens = 0;
        int amountOfOdds = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Enter a number to put into the matrix: ");
                int number = sc.nextInt();
                m[i][j] = number;
                if (number % 2 == 0) {
                    amountOfEvens += 1;
                } else {
                    amountOfOdds += 1;
                }
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("the amount of even numbers is " + amountOfEvens);
        System.out.println("the amount of odd numbers is " + amountOfOdds);

        sc.close();
    }
}
