package exercise1;

import java.util.Locale;

public class Exercise1 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        
        Person p1 = new Person();
        p1.setName("Rangel");
        p1.setAge(26);
        p1.setHeight(1.75);

        p1.printInfo();
    }
}
