import java.util.Locale;
import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] v1 = new int[15];
        int[] compact;
        String stringArray = "";

        for (int i = 0; i < v1.length; i++) {
            System.out.print("Enter the " + (i + 1) + "° number to the array v1: ");
            v1[i] = sc.nextInt();
        }

        for (int i = 0; i < v1.length; i++) {
            if (v1[i] != 0) {
                stringArray += v1[i] + " ";
            }
        }

        String[] array = stringArray.split(" ");
        compact = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            compact[i] = Integer.parseInt(array[i]);
        }

        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < compact.length; i++) {
            System.out.print(compact[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
