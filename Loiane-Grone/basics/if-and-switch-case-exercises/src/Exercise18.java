import java.util.Locale;
import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a date in this format (dd/mm/yyyy): ");
        String date = sc.nextLine();
        String[] splitDate = date.split("/");
        int day = Integer.parseInt(splitDate[0]);
        int month = Integer.parseInt(splitDate[1]);
        int year = Integer.parseInt(splitDate[2]);
        String notValidDate = "Invalid date!";
        String validDate = "Valid date!";

        if (year > 0) {
            if (day > 0 && day < 32 && month > 0 && month < 13) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println(validDate);
                        break;
                    case 2: {
                        if (
                            ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                            && day > 29
                        ) {
                            System.out.println(notValidDate);
                        } else if (
                            !((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                            && day > 28
                        ) {
                            System.out.println(notValidDate);
                        } else  {
                            System.out.println(validDate);
                        }
                        break;
                    }
                    case 4:
                    case 6:
                    case 9:
                    case 11: {
                        if (day > 30) {
                            System.out.println(notValidDate);
                        } else {
                            System.out.println(validDate);
                        }
                        break;
                    }
                }
            } else {
                System.out.println(notValidDate);
            }
        } else {
            System.out.println(notValidDate);
        }

        sc.close();
    }
}
