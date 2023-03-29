import java.util.Locale;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int theBiggest = Integer.MIN_VALUE;

        for (int count = 1; count < 6; count++) {
            System.out.print("Enter the " + count + "º number: ");
            int number = sc.nextInt();
            if (number > theBiggest) {
                theBiggest = number;
            }
        }

        System.out.println("The biggest number is " + theBiggest);

        sc.close();
    }
}
