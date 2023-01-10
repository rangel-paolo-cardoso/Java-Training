import java.util.Locale;
import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the nth term: ");
        int term = sc.nextInt();
        int actual = 1;
        int previous = 1;
        int sequence = 1;

        for (int count = 0; count <= term - 1; count += 1) {
            if (count < 2) {
                previous = 1;
                actual = 1;
                sequence = 1;
            } else {
                sequence = actual + previous;
            }
            if (count == term - 1) {
                System.out.print(sequence + "\n");
                break;
            } else {
                System.out.print(sequence + ",");
            }
            previous = actual;
            actual = sequence;
        }
        
        sc.close();
    }
}
