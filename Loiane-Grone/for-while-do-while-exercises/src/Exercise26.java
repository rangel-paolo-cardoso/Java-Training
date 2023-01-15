import java.util.Locale;
import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of voters? ");
        int numberOfVoters = sc.nextInt();
        int candidate1 = 0;
        int candidate2 = 0;
        int candidate3 = 0;

        for (int count = 1; count <= numberOfVoters; count += 1) {
            System.out.println(count + "º voter");
            System.out.println("Who do you want to vote for? (1, 2 or 3) ");
            int vote = sc.nextInt();
            switch (vote) {
                case 1:
                    candidate1 += 1;
                    break;
                case 2:
                    candidate2 += 1;
                    break;
                case 3:
                    candidate3 += 1;
                    break;
                default:;
            }
        }

        System.out.println("Candidate1: " + candidate1 + " votes");
        System.out.println("Candidate2: " + candidate2 + " votes");
        System.out.println("Candidate3: " + candidate3 + " votes");

        sc.close();
    }
}
