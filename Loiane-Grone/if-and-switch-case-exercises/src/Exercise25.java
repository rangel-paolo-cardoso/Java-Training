import java.util.Locale;
import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Investigation Questionnaire");
        System.out.print("Did you call the victim on the phone (Y / N)? ");
        char calledOnThePhone = sc.next().toUpperCase().charAt(0);

        System.out.print("Have you been to the crime location (Y / N)? ");
        char onTheCrimeLocation = sc.next().toUpperCase().charAt(0);

        System.out.print("Do you live near the victim (Y / N)? ");
        char liveNearTheVictim = sc.next().toUpperCase().charAt(0);

        System.out.print("Did you owe the victim (Y / N)? ");
        char owedTheVictim = sc.next().toUpperCase().charAt(0);

        System.out.print("Have you ever worked with the victim (Y / N)? ");
        char workedWithTheVictim = sc.next().toUpperCase().charAt(0);

        int assessmentCount = 0;
        char[] answers = {
            calledOnThePhone,
            onTheCrimeLocation,
            liveNearTheVictim,
            owedTheVictim,
            workedWithTheVictim
        };

        for (char answer : answers) {
            if (answer == 'Y') {
                assessmentCount += 1;
            }
        }

        if (assessmentCount < 2) {
            System.out.println("Innocent");
        } else if (assessmentCount < 3) {
            System.out.println("Suspicious");
        } else if (assessmentCount < 5) {
            System.out.println("Accomplice");
        } else {
            System.out.println("Murderer");
        }

        sc.close();
    }
}
