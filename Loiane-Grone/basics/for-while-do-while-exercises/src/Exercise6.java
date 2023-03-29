import java.util.Locale;

public class Exercise6 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        for (int number = 1; number < 21; number += 1) {
            System.out.println(number);
        }
        System.out.println();
        for (int number = 1; number < 21; number += 1) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
