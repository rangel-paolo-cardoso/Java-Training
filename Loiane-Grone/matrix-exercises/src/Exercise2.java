import java.util.Locale;

public class Exercise2 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        int[][] m = new int[10][10];
        int largestNumberOnLine5 = Integer.MIN_VALUE;
        int smallestNumberOnLine5 = Integer.MAX_VALUE;
        int largestNumberOnColumn7 = Integer.MIN_VALUE;
        int smallerNumberOnColumn7 = Integer.MAX_VALUE;

        for (int line = 0; line < m.length; line++) {
            for (int column = 0; column < m[line].length; column++) {
                int number = (int) Math.round(Math.random() * 9);
                m[line][column] = number;
                if (line == (5 - 1) && (number > largestNumberOnLine5)) {
                    largestNumberOnLine5 = number;
                }
                if (line == (5 - 1) && (number < smallestNumberOnLine5)) {
                    smallestNumberOnLine5 = number;
                }
                if (column == (7 - 1) && (number > largestNumberOnColumn7)) {
                    largestNumberOnColumn7 = number;
                }
                if (column == (7 - 1) && (number < smallerNumberOnColumn7)) {
                    smallerNumberOnColumn7 = number;
                }
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The largest number on line 5 is " + largestNumberOnLine5);
        System.out.println("The smallest number on line 5 is " + smallestNumberOnLine5);
        System.out.println();
        System.out.println("The largest number on column 7 is " + largestNumberOnColumn7);
        System.out.println("The smallest number on column 7 is " + smallerNumberOnColumn7);
    }
}
