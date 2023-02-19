import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        int number = sc.nextInt();
        System.out.println("Its double is " + doubleTheNumber(number));
        sc.close();
    }

    static int doubleTheNumber(int number) {
        return number * 2;
    }
}
