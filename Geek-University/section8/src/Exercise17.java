import java.util.Locale;
import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter another whole number: ");
        int number2 = sc.nextInt();

        int sum = sumBetweenNumber1AndNumber2(number1, number2);
        System.out.println("The sum is " + sum);

        sc.close();
    }

    static int sumBetweenNumber1AndNumber2(int number1, int number2) {
        int sum = 0;
        if (number2 > number1) {
            for (int i = number1; i <= number2; i += 1) {
                sum += i;
            }
        } else {
            for (int i = number2; i <= number1; i += 1) {
                sum += i;
            }
        }
        return sum;
    }
}
