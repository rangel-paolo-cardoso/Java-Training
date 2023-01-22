import java.util.Locale;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int evenNumbersAmount = 0;

        int count = 1;
        while (true) {
            System.out.print("Enter the " + count + "º element: ");
            int number = sc.nextInt();
            a[count - 1] = number;
            if (number % 2 == 0) {
                evenNumbersAmount += 1;
            }
            count +=1;
            if (count == a.length + 1) {
                break;
            }
        }

        System.out.println("Amount of even number: " + evenNumbersAmount);

        sc.close();
    }
}
