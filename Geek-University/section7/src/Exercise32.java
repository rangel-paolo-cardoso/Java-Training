import java.util.Locale;
import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] x = new int[5];
        int[] y = new int[x.length];
        String stringArray = "";
        int[] addition = new int[x.length];
        int[] multiplication = new int[x.length];
        int[] difference;
        int[] intersection;
        int[] union;
        boolean exists = false;
        int count = 0;

        for (int i = 0; i < x.length; i++) {
            System.out.print("Enter the " + (i + 1) + "° number to the array x: ");
            x[i] = sc.nextInt();

            System.out.print("Enter the " + (i + 1) + "° number to the array y: ");
            y[i] = sc.nextInt();
        }

        for (int i = 0; i < x.length; i++) {
            addition[i] = x[i] + y[i];
        }

        for (int i = 0; i < x.length; i++) {
            multiplication[i] = x[i] * y[i];
        }

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if (x[i] == y[j]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                stringArray += x[i] + " ";
                count += 1;
            }
            exists = false;
        }
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (y[i] == x[j]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                stringArray += y[i] + " ";
                count += 1;
            }
            exists = false;
        }
        difference = new int[count];

        String[] array = stringArray.split(" ");
        for (int i = 0; i < difference.length; i++) {
            difference[i] = Integer.parseInt(array[i]);
        }

        count = 0;
        stringArray = "";
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if (x[i] == y[j]) {
                    for (int k = 0; k < stringArray.length(); k++) {
                        exists = stringArray.charAt(k) == Character.forDigit(x[i], 10);
                        if (exists) {
                            break;
                        }
                    }
                    if (!exists) {
                        stringArray += x[i] + " ";
                        count += 1;
                    }
                    exists = false;
                }
            }
        }

        intersection = new int[count];
        array = stringArray.split(" ");
        for (int i = 0; i < intersection.length; i++) {
            intersection[i] = Integer.parseInt(array[i]);
        }

        count = 0;
        stringArray = "";
        for (int i = 0; i < x.length; i++) {
            for (int k = 0; k < stringArray.length(); k++) {
                exists = stringArray.charAt(k) == Character.forDigit(x[i], 10);
                if (exists) {
                    break;
                }
            }
            if (!exists) {
                stringArray += x[i] + " ";
                count += 1;
            }
            exists = false;
        }

        for (int i = 0; i < y.length; i++) {
            for (int k = 0; k < stringArray.length(); k++) {
                exists = stringArray.charAt(k) == Character.forDigit(y[i], 10);
                if (exists) {
                    break;
                }
            }
            if (!exists) {
                stringArray += y[i] + " ";
                count += 1;
            }
            exists = false;
        }

        union = new int[count];
        array = stringArray.split(" ");
        for (int i = 0; i < union.length; i++) {
            union[i] = Integer.parseInt(array[i]);
        }

        System.out.println("Sum");
        for (int i = 0; i < addition.length; i++) {
            System.out.print(addition[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Multiplication");
        for (int i = 0; i < multiplication.length; i++) {
            System.out.print(multiplication[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Difference");
        for (int i = 0; i < difference.length; i++) {
            System.out.print(difference[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Intersection");
        for (int i = 0; i < intersection.length; i++) {
            System.out.print(intersection[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Union");
        for (int i = 0; i < union.length; i++) {
            System.out.print(union[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
