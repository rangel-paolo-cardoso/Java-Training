import java.util.Locale;
import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Inform the withdraw amount: ");
        int withdraw = sc.nextInt();
        int rest = withdraw;
        int billsOfOne = 0;
        int billsOfFive = 0;
        int billsOfTen = 0;
        int billsOfFifty = 0;
        int billsOfAHundred = 0;

        if (withdraw > 9 && withdraw < 601) {
            if (rest > 100) {
                billsOfAHundred = rest / 100;
                rest = rest % 100;
            }
            if (rest > 50) {
                billsOfFifty = rest / 50;
                rest = rest % 50;
            }
            if (rest > 10) {
                billsOfTen = rest / 10;
                rest = rest % 10;
            }
            if (rest > 5) {
                billsOfFive = rest / 5;
                rest = rest % 5;
            }
            if (rest > 1) {
                billsOfOne = rest / 1;
                rest = rest % 1;
            }
        } else {
            System.out.println("Withdraw amount not allowed!");
        }

        System.out.printf("%d bill(s) of 100\n", billsOfAHundred);
        System.out.printf("%d bill(s) of 50\n", billsOfFifty);
        System.out.printf("%d bill(s) of 10\n", billsOfTen);
        System.out.printf("%d bill(s) of 5\n", billsOfFive);
        System.out.printf("%d bill(s) of 1\n", billsOfOne);

        sc.close();
    }
}
