import java.util.Locale;
import java.util.Scanner;

public class Exercise52 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your cash withdrawal: ");
        int withdrawal = sc.nextInt();
        int[] bills = {100, 50, 20, 10, 5, 2, 1};
        int[] numberOfbills = new int[bills.length];
        int rest = withdrawal;

        int pos = 0;
        while (true) {
            if (rest == 1) {
                numberOfbills[numberOfbills.length - 1] = rest / 1;
                break;
            }
            if (rest % bills[pos] > 0) {
                numberOfbills[pos] = rest / bills[pos];
                rest %= bills[pos];
            }
            pos += 1;
        }

        for (int i = 0; i < numberOfbills.length; i++) {
            System.out.println("Bills of " + bills[i] + ": " + numberOfbills[i]);
        }

        sc.close();
    }
}
