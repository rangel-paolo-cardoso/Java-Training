import java.util.Locale;
import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int peopleOver35 = 0;

        for (int pos = 0; pos < a.length; pos += 1) {
            System.out.print("Enter the age of the " + (pos + 1) + "º person: ");
            int number = sc.nextInt();
            if (number > 35) {
                peopleOver35 += 1;
            }
            a[pos] = number;
        }

        System.out.println("Number of people over 35 is: " + peopleOver35);

        sc.close();
    }
}
