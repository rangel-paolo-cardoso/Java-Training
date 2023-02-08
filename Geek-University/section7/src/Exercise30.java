import java.util.Locale;
import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] v1 = new int[10];
        int[] v2 = new int[v1.length];
        String arrayString = "";
        int[] intersection;

        for (int i = 0; i < v1.length; i++) {
            System.out.print("Enter the " + (i + 1) + "° number to the array v1: ");
            v1[i] = sc.nextInt();

            System.out.print("Enter the " + (i + 1) + "° number to the array v2: ");
            v2[i] = sc.nextInt();
        }

        // while (true) {
        //     int pos = 0;
        //     for (int i = 0; i < v1.length; i++) {
        //         aux[pos] = v1[i];
        //         pos += 1;
        //     }
        //     for (int i = 0; i < v2.length; i++) {
        //         aux[pos] = v2[i];
        //         pos += 1;
        //     }
        //     break;
        // }

        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v2.length; j++) {
                if (v1[i] == v2[j]) {
                    boolean doesNumberExist = false;
                    for (int k = 0; k < arrayString.length(); k++) {
                        doesNumberExist = arrayString.charAt(k) == Character.forDigit(v1[i], 10);
                        if (doesNumberExist) {
                            break;
                        }
                    }
                    if (!doesNumberExist) {
                        arrayString += v1[i] + " ";
                    }
                }
            }
        }

        String[] convertedArrayString = arrayString.split(" ");
        intersection = new int[convertedArrayString.length];

        for (int i = 0; i < convertedArrayString.length; i++) {
            intersection[i] = Integer.parseInt(convertedArrayString[i]);
        }

        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < v2.length; i++) {
            System.out.print(v2[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < intersection.length; i++) {
            System.out.print(intersection[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
