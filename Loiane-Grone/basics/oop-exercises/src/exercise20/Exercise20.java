package exercise20;

import java.util.Locale;
import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to generate the Fibonacci's sequence: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i += 1) {
            System.out.print(fibonacci(i) + ", ");
        }

        sc.close();
    }

    static int fibonacci(int n) {
        return (n < 2) ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
    }
}
