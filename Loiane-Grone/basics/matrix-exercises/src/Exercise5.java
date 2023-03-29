import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int months = 12;
        int days = 30;
        int hours = 24;
        String[][][] appointments = new String[months][days][hours];

        // Note: This exercise does not consider using functions or methods.
        System.out.println("Insert an appointent...");
        do {
            int month;
            int day;
            int hour;
            System.out.println("Enter 1 to schedule an appointment.");
            System.out.println("Enter 2 to check the appointment.");
            System.out.print("- - - > ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Inform the month of the year (1-12): ");
                    month = sc.nextInt() - 1;

                    System.out.print("Inform the day of the month (1-30): ");
                    day = sc.nextInt() - 1;

                    System.out.print("Inform the hour of the day (1-8): ");
                    hour = sc.nextInt() - 1;
                    sc.nextLine();

                    while (month < 0 || month > 11 || day < 0 || day > 29 || hour < 0 || hour > 7) {
                        System.out.println("Invalid entried!");
                        System.out.print("Inform the month of the year (1-12): ");
                        month = sc.nextInt() - 1;

                        System.out.print("Inform the day of the month (1-30): ");
                        day = sc.nextInt() - 1;

                        System.out.print("Inform the hour of the day (1-8): ");
                        hour = sc.nextInt() - 1;
                        sc.nextLine();
                    }

                    System.out.print("Enter the name of your appointment to the agenda: ");
                    String appointment = sc.nextLine();

                    appointments[month][day][hour] = appointment;
                    break;
                case 2:
                    System.out.print("Inform the month of the year (1-12): ");
                    month = sc.nextInt() - 1;

                    System.out.print("Inform the day of the month (1-30): ");
                    day = sc.nextInt() - 1;

                    System.out.print("Inform the hour of the day (1-24): ");
                    hour = sc.nextInt() - 1;

                    while (month < 0 || month > 11 || day < 0 || day > 29 || hour < 0 || hour > 7) {
                        System.out.print("Inform the month of the year (1-12): ");
                        month = sc.nextInt() - 1;

                        System.out.print("Inform the day of the month (1-30): ");
                        day = sc.nextInt() - 1;

                        System.out.print("Inform the hour of the day (1-8): ");
                        hour = sc.nextInt() - 1;
                        sc.nextLine();
                    }

                    System.out.printf("Appointment in month %d, day %d at %d hours \n", month, day, hour);
                    System.out.println(appointments[month][day][hour]);
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }

            System.out.print("Do you want to continue? (yes or y to continue) ");
            String answer = sc.next();
            if (!(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes"))) {
                break;
            }
            
        } while (true);

        sc.close();
    }
}
