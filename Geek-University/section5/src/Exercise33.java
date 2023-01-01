import java.util.Locale;
import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number n: ");
        int n = sc.nextInt();

        System.out.print("Enter the number i: ");
        int i = sc.nextInt();

        System.out.print("Enter the number j: ");
        int j = sc.nextInt();

        int count = 0;
        int multiple = 0;
        while (true) {
            if (
                multiple % i == 0 || multiple % j == 0
                || (multiple % i == 0 && multiple % j == 0)
            ) {
                count += 1;
                if (count == n) {
                    System.out.println(multiple);
                    break;
                } else {
                    System.out.print(multiple + ",");
                }
            }
            multiple += 1;
        }

        sc.close();
    }
}
