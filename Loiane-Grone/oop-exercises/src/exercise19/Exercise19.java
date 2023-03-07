package exercise19;

import java.util.Locale;

public class Exercise19 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        double seconds = TimeUnitConversation.convertMinutesToSeconds(5);
        System.out.println(5 + " minutes are equal to " + seconds + " seconds");

        double minutes = TimeUnitConversation.convertHoursToMinutes(10);
        System.out.println(10 + " hours are equal to " + minutes + " minutes");

        double hours = TimeUnitConversation.convertDaysToHours(5);
        System.out.println(5 + " days are equal to " + hours + " hours");

        double days = TimeUnitConversation.convertWeekToDays(1000);
        System.out.println(1000 + " weeks are equal to " + days + " days");

        double days2 = TimeUnitConversation.convertMonthToDays(1000);
        System.out.println(12 + " months are equal to " + days2 + " days");

        double days3 = TimeUnitConversation.convertYearsToDays(50);
        System.out.println(50 + " years are equal to " + days3 + " days");
    }
}
