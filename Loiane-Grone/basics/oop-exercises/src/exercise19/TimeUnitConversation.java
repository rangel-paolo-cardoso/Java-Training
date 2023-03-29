package exercise19;

public class TimeUnitConversation {
    
    static private int minutesToSeconds = 60;
    static private int hoursToMinutes = 60;
    static private int daysToHours = 24;
    static private int weekToDays = 7;
    static private int monthToDays = 30;
    static private double yearToDays = 365.35;

    static public int convertMinutesToSeconds(int minutes) {
        return minutes * minutesToSeconds;
    }

    static public int convertHoursToMinutes(int hours) {
        return hours * hoursToMinutes;
    }

    static public int convertDaysToHours(int days) {
        return days * daysToHours;
    }

    static public int convertWeekToDays(int week) {
        return week * weekToDays;
    }

    static public int convertMonthToDays(int month) {
        return month * monthToDays;
    }

    static public double convertYearsToDays(int years) {
        return years * yearToDays;
    }
}
