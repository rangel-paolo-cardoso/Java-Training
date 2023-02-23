import java.util.Locale;
import java.util.Scanner;

public class Exercise10 {

    private static final double PI = 3.141592;
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter another number: ");
        double number2 = sc.nextDouble();
        
        double volume = decideTheLargestNumber(number1, number2);
        System.out.printf("Volume: %.2f \n", volume);

        sc.close();
    }

    static double decideTheLargestNumber(double number1, double number2) {
        return (number1 > number2) ? number1 : number2;
    }
}
