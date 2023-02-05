import java.util.Locale;
import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[50];
        
        for (int i = 0; i < numbers.length; i += 1) {
            numbers[i] = (i + 5 * i) % (i + 1);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        sc.close();
    }
}
