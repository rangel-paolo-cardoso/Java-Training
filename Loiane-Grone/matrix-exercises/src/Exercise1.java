import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[4][4];
        int largestNumber = Integer.MIN_VALUE;
        int positionI = 0;
        int positionJ = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Enter a number to put into the matrix: ");
                int number = sc.nextInt();
                m[i][j] = number;
                if (number > largestNumber) {
                    largestNumber = number;
                    positionI = i;
                    positionJ = j;
                }
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The largest number of this matrix is: " + largestNumber);
        System.out.printf("Its positions are m[%d] and m[%d]\n", positionI, positionJ);

        sc.close();
    }
}
