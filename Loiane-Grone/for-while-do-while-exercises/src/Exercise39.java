import java.util.Locale;
import java.util.Scanner;

public class Exercise39 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int theTallestStudentCode = 0;
        double theTallestStudentHeight = Double.MIN_VALUE;

        int theShortesStudentCode = 0;
        double theShortesStudentHeight = Double.MAX_VALUE;

        String studentsData = "";

        for (int count = 1; count <= 10; count += 1) {
            System.out.print("Enter the student's registration number: ");
            int registrationNumber = sc.nextInt();

            System.out.print("Enter the student's height in centimeters: ");
            double studentHeight = sc.nextDouble();
            if (count == 10) {
                studentsData += registrationNumber + "," + studentHeight;
            } else {
                studentsData += registrationNumber + "," + studentHeight + ";";
            }
        }

        String[] students = studentsData.split(";");
        for (int pos = 0; pos < students.length; pos++) {
            String[] student = students[pos].split(",");
            double height = Double.parseDouble(student[1]);
            if (height > theTallestStudentHeight) {
                theTallestStudentCode = Integer.parseInt(student[0]);
                theTallestStudentHeight = height;
            }
            if (height < theShortesStudentHeight) {
                theShortesStudentCode = Integer.parseInt(student[0]);
                theShortesStudentHeight = height;
            }
        }

        System.out.println("Code: " + theTallestStudentCode);
        System.out.println("The tallest student: " + theTallestStudentHeight);
        System.out.println();
        System.out.println("Code: " + theShortesStudentCode);
        System.out.println("The shortest student: " + theShortesStudentHeight);

        sc.close();
    }
}
