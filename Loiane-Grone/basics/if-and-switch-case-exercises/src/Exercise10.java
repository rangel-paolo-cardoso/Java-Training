import java.util.Locale;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Which shift do you study? (M, V, N) ");
        char shift = sc.next().toUpperCase().charAt(0);

        switch (shift) {
            case 'M':
                System.out.println("Good morning!");
                break;
            case 'V':
                System.out.println("Good afternoon!");
                break;
            case 'N':
                System.out.println("Good evening!");
                break;
            default:
                System.out.println("Invalid value!");
        }

        sc.close();
    }
}
