import java.util.Locale;
import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students are there to calculate the average age? ");
        int numberOfPeople = sc.nextInt();
        double ageAverage = 0.0;

        int count = 0;
        while (count < numberOfPeople) {
            System.out.print("Enter the age of the " + (count + 1) + "º person: ");
            int age = sc.nextInt();
            ageAverage += age;
            count += 1;
        }

        ageAverage /= numberOfPeople;

        if (ageAverage > 0 && ageAverage < 26) {
            System.out.println("The class is young");
        } else if (ageAverage < 61) {
            System.out.println("The class is adult");
        } else {
            System.out.println("The class is elderly");
        }

        sc.close();
    }
}
