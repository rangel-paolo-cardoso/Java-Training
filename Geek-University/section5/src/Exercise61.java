import java.util.Locale;
import java.util.Scanner;

public class Exercise61 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int largestPalindrome = 0;

        for (int i = 100; i <= 999; i += 1) {
            for (int j = 100; j <= 999; j += 1) {
                boolean isPalindrome = true;
                char[] multiplication = String.valueOf(i * j).toCharArray();

                for (int k = 0; k < (multiplication.length / 2); k++) {
                    if (multiplication[k] != multiplication[multiplication.length - 1 - k]) {
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome) {
                    largestPalindrome = i * j;
                }
            }
        }

        System.out.println(
            "The largest palindrome formed by the multiplication of 2 number with 3 digits is "
            + largestPalindrome
            );

        sc.close();
    }
}
