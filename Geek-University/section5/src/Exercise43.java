import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercise43 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double averageAge= 0.0;
        int count = 0;
        System.out.println("Average age.");
        System.out.println("Enter a zero to exit.");
        do {
            System.out.print("Inform the age of the person: ");
            int age = sc.nextInt();
            if (age == 0) {
                break;
            }
            count += 1;
            averageAge += age;
        } while (true);

        String pattern = "###.##";
        DecimalFormat df = new DecimalFormat(pattern);

        averageAge /= (float) count;

        System.out.println("The average age is " + df.format(averageAge));

        sc.close();
    }
}
