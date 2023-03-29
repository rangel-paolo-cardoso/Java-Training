package exercise6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Exercise6 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Contact contact = new Contact();

        contact.phoneNumber = "+00 (11) 0 0000-0000";
        contact.email = "exercise6@outlook.com";
        contact.address = "St. Code, N 23, 00-478";
        contact.birthDay = format.format(format.parse("05/07/2002"));
        contact.note = "I code Java";
        contact.nickName = "Javer";

        System.out.println("Phone number: " + contact.phoneNumber);
        System.out.println("Email: " + contact.email);
        System.out.println("Address: " + contact.address);
        System.out.println("Birth day: " + contact.birthDay);
        System.out.println("Note: " + contact.note);
        System.out.println("Nickname: " + contact.nickName);
    }
}
