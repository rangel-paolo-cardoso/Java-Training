import java.util.Locale;
import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] studentsNumber = new int[10];
        double[] studentsHeight = new double[studentsNumber.length];
        double tallest = Double.MIN_VALUE;
        double shortest = Double.MAX_VALUE;

        for (int i = 0; i < studentsNumber.length; i++) {
            System.out.print("Enter the " + (i + 1) + "º student's number: ");
            studentsNumber[i] = sc.nextInt();

            System.out.print("Enter the " + (i + 1) + "º student's height: ");
            studentsHeight[i] = sc.nextDouble();

            if (studentsHeight[i] > tallest) {
                tallest = studentsHeight[i];
            }

            if (studentsHeight[i] < shortest) {
                shortest = studentsHeight[i];
            }
        }

        for (int i = 0; i < studentsHeight.length; i++) {
            if (studentsHeight[i] == shortest) {
                System.out.println("Number of the shortest student: " + studentsNumber[i]);
                System.out.println("The shortest student's height: " + studentsHeight[i]);
                break;
            }
        }

        for (int i = 0; i < studentsHeight.length; i++) {
            if (studentsHeight[i] == tallest) {
                System.out.println("Number of the tallest student: " + studentsNumber[i]);
                System.out.println("The tallest student's height: " + studentsHeight[i]);
                break;
            }
        }

        sc.close();
    }
}
