import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[8];

        for (int pos = 0; pos < numbers.length; pos += 1) {
            System.out.print("Enter the " + (pos + 1) + "° value: ");
            int value = sc.nextInt();
            numbers[pos] = value;
        }

        System.out.print("Inform a postion of the array: ");
        int position1 = sc.nextInt();

        System.out.print("Inform another postion of the array: ");
        int position2 = sc.nextInt();

        int arrayRightBound = numbers.length - 1;
        int arrayLeftBound = 0;
        if (
            position1 >= arrayLeftBound && position1 <= arrayRightBound
            && position2 >= arrayLeftBound && position2 <= arrayRightBound
        ) {
            int sum = 0;
            sum += numbers[position1] + numbers[position2];
            System.out.printf("The postions are a[%d] and a[%d]\n", position1, position2);
            System.out.printf("The numbers residing on those postions are: %d and %d\n",
                numbers[position1], numbers[position2]
            );
            System.out.println("The total sum is " + (numbers[position1] + numbers[position2]));
        } else {
            System.out.println("Invalida entries for the array positions!");
        }

        sc.close();
    }
}
