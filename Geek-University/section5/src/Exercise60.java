import java.util.Locale;
import java.util.Scanner;

public class Exercise60 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int amountOFNumbers = 0;
        double numberAverage = 0.0;
        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        double evenNumberAverage = 0.0;
        int evenNUmberCount = 0;
        System.out.println("Enter zero to exit.");
        do {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
            amountOFNumbers += 1;
            numberAverage += number;
            if (number > largestNumber) {
                largestNumber = number;
            }
            if (number < smallestNumber) {
                smallestNumber = number;
            }
            if (number % 2 == 0) {
                numberAverage += number;
                evenNumberAverage += number;
                evenNUmberCount += 1;
            }
        } while (true);

        numberAverage = sum / (float)amountOFNumbers;
        evenNumberAverage /= evenNUmberCount;

        System.out.println("\nThe total sum is " + sum);
        System.out.println("The amount of numbers is " + amountOFNumbers);
        System.out.println("The average of all numbers is " + numberAverage);
        System.out.println("The largest number is " + largestNumber);
        System.out.println("The smallest number is " + smallestNumber);
        System.out.println("The average of the even numbers is " + evenNumberAverage);

        sc.close();
    }
}
