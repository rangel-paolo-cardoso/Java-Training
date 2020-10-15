import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

/**
 * CalendarMain
 */
public class CalendarMain {

  public static void main(String[] args) throws ParseException {
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    Date d = Date.from(Instant.parse("2020-06-25T15:42:07Z"));

    System.out.println(sdf.format(d));

    Calendar cal = Calendar.getInstance();
    cal.setTime(d);
    int minutes = cal.get(Calendar.MINUTE);
    int month = cal.get(Calendar.MONTH) + 1;

    System.out.println("Minutes: " + minutes);
    System.out.println("Month: " + month);
    System.out.println(sdf.format(d));
  }
}