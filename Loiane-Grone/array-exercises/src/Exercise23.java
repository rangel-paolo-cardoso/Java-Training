import java.util.Locale;
import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        boolean isPalindrome = true;

        for (int pos = 0; pos < a.length; pos++) {
            System.out.print("Enter the " + (pos + 1) + "º value: ");
            int value = sc.nextInt();
            a[pos] = value;
        }

        for (int pos = 0; pos < (a.length / 2); pos++) {
            if (a[pos] != a[a.length - 1 - pos]) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is the array a palindrome? " + isPalindrome);

        sc.close();
    }
}
