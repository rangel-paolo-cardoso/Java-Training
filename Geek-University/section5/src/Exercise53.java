import java.util.Locale;
import java.util.Scanner;

public class Exercise53 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive whole number: ");
        int n = sc.nextInt();
        int aux = 1;

        for (int line = 1; line <= n; line += 1) {
            for (int column = 1; column <= line; column += 1) {
                System.out.printf("%d\t", aux);
                aux += 1;
            }
            System.out.println();
        }

        sc.close();
    }
}
