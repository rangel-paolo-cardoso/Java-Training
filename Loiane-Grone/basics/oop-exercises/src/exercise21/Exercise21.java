package exercise21;

import java.util.Locale;
import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a whole number to calculate the summation: ");
        int n = sc.nextInt();

        int result = summation(n);
        System.out.printf("the result is %d\n", result);

        sc.close();
    }

    static int summation(int n) {
        return (n > 1) ? n + summation(n - 1) : 1;
    }
}
