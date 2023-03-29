import java.util.Locale;

public class Exercise9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        for (int count = 1; count <= 50; count += 1) {
            if (count % 2 != 0) {
                System.out.println(count);
            }
        }
    }
}
