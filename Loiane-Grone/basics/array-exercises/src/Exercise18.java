import java.util.Locale;
import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int oldestAge = Integer.MIN_VALUE;
        int positionOfTheOldestPerson = 0;
        int youngestAge = Integer.MAX_VALUE;
        int positionOfTheYoungestPerson = 0;

        for (int pos = 0; pos < a.length; pos += 1) {
            System.out.print("Enter the age of the " + (pos + 1) + "º person: ");
            int age = sc.nextInt();
            if (age > oldestAge) {
                oldestAge = age;
                positionOfTheOldestPerson = pos;
            }
            if (age < youngestAge) {
                youngestAge = age;
                positionOfTheYoungestPerson = pos;
            }
        }

        System.out.println("The youngest person is " + youngestAge + " years old.");
        System.out.println("Position in the array is: " + positionOfTheYoungestPerson);
        System.out.println("The oldest person is " + oldestAge + " years old.");
        System.out.println("Position in the array is: " + positionOfTheOldestPerson);

        sc.close();
    }
}
