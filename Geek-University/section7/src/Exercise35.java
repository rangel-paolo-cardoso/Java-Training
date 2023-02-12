import java.util.Locale;
import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int limit = 10_000;
        int a = limit;
        int b = limit;

        System.out.println("Enter positive number less than 10,000");
        while (a > limit - 1 || a < 0 || b > limit - 1 || b < 0) {
            System.out.print("Enter a number: ");
            a = sc.nextInt();

            System.out.print("Enter anither number: ");
            b = sc.nextInt();
        }

        String[] stringA = String.valueOf(a).split("");
        String[] stringB = String.valueOf(b).split("");
        int[] arrayA = new int[stringA.length];
        int[] arrayB = new int[stringB.length];
        int[] sum = new int[stringA.length + 1];

        for (int i = 0, j = arrayA.length - 1; i < arrayA.length; i++, j--) {
            arrayA[i] = Integer.parseInt(stringA[j]);
        }

        for (int i = 0, j = arrayB.length - 1; i < arrayB.length; i++, j--) {
            arrayB[i] = Integer.parseInt(stringB[j]);
        }

        boolean previousLargerThan10 = false;
        for (int i = 0; i < sum.length; i++) {
            if (i < arrayA.length && i < arrayB.length) {
                int result = arrayA[i] + arrayB[i];
                if (previousLargerThan10) {
                    result += 1;
                    previousLargerThan10 = false;
                }
                if (result > 9) {
                    previousLargerThan10 = true;
                    sum[i] += result - 10;
                } else {
                    sum[i] += result;
                }
            }
        }

        String finalResultString = "";
        for (int i = sum.length - 1; i > -1; i--) {
            finalResultString += sum[i];
        }

        System.out.println(Integer.parseInt(finalResultString));

        sc.close();
    }
}
