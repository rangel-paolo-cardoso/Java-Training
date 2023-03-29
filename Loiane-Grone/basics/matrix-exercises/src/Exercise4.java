import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int days = 30;
        int hours = 24;
        String[][] appointments = new String[days][hours];

        System.out.println("Insert an appointent...");
        do {
            int day;
            int hour;
            System.out.println("Enter 1 to schedule an appointment.");
            System.out.println("Enter 2 to check the appointment.");
            System.out.print("- - - > ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Inform the day of the month (1-30): ");
                    day = sc.nextInt() - 1;

                    System.out.print("Inform the hour of the day (1-24): ");
                    hour = sc.nextInt() - 1;
                    sc.nextLine();

                    System.out.print("Enter the name of your appointment to the agenda: ");
                    String appointment = sc.nextLine();

                    appointments[day][hour] = appointment;
                    break;
                case 2:
                    System.out.print("Inform the day of the month (1-30): ");
                    day = sc.nextInt() - 1;

                    System.out.print("Inform the hour of the day (1-24): ");
                    hour = sc.nextInt() - 1;

                    System.out.printf("Appointment on day %d at %d hours \n", day, hour);
                    System.out.println(appointments[day][hour]);
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
