import java.util.Locale;
import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-zero whole number: ");
        int number = sc.nextInt();

        int sumOfFigutes = sumFigures(number);
        System.out.println("the sum of each digit is " + sumOfFigutes);

        sc.close();
    }

    static int sumFigures(int number) {
        String[] stringNumber = String.valueOf(number).split("");
        int sum = 0;
        for (String digit : stringNumber) {
            sum += Integer.parseInt(digit);
        }
        return sum;
    }
}
