import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (dd/mm/yyyy): ");
        String date = sc.next();
        System.out.println(fullDateFormat(date));
        sc.close();
    }

    static String fullDateFormat(String date) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] dateArray = date.split("/");
        int day = Integer.parseInt(dateArray[0]);
        int month = Integer.parseInt(dateArray[1]);
        int year = Integer.parseInt(dateArray[2]);
        switch (month) {
            case 1:
                stringBuffer.append("January");
                break;
            case 2:
                stringBuffer.append("February");
                break;
            case 3:
                stringBuffer.append("March");
                break;
            case 4:
                stringBuffer.append("April");
                break;
            case 5:
                stringBuffer.append("May");
                break;
            case 6:
                stringBuffer.append("June");
                break;
            case 7:
                stringBuffer.append("July");
                break;
            case 8:
                stringBuffer.append("August");
                break;
            case 9:
                stringBuffer.append("September");
                break;
            case 10:
                stringBuffer.append("October");
                break;
            case 11:
                stringBuffer.append("November");
                break;
            case 12:
                stringBuffer.append("December");
                break;
        }
        stringBuffer.append(" ");
        stringBuffer.append(day);
        switch (day) {
            case 1:
                stringBuffer.append("st, ");
                break;
            case 2:
                stringBuffer.append("nd, ");
                break;
            case 3:
                stringBuffer.append("rd, ");
                break;
            default:
                stringBuffer.append("th, ");
        }
        stringBuffer.append(year + ".");
        return stringBuffer.toString();
    }
}
