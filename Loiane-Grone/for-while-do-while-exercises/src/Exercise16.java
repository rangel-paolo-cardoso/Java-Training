import java.util.Locale;

public class Exercise16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int actual = 1;
        int previous = 1;
        int sequence = 1;

        for (int count = 0;; count += 1) {
            if (count < 2) {
                previous = 1;
                actual = 1;
                sequence = 1;
            } else {
                sequence = actual + previous;
            }
            if (sequence > 500) {
                System.out.print(sequence + "\n");
                break;
            } else {
                System.out.print(sequence + ",");
            }
            previous = actual;
            actual = sequence;
        }
    }
}
