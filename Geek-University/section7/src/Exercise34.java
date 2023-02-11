import java.util.Locale;
import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] v1 = new int[10];
        boolean exists = false;

        int i = 0;
        for (; i < v1.length;) {
            System.out.print("Enter the " + (i + 1) + "° number to the array v1: ");
            int number = sc.nextInt();
            for (int j = 0; j < v1.length; j++) {
                if (v1[j] == number) {
                    exists = true;
                    break;
                }
            }
            if (exists) {
                System.out.println("Number already exists!");
            } else {
                v1[i] = number;
                i += 1;
            }
            exists = false;
        }

        for (int j = 0; j < v1.length; j++) {
            System.out.print(v1[j] + " ");
        }
        System.out.println();

        sc.close();
    }
}
