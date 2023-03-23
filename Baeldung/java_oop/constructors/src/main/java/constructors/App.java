package constructors;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        LocalDateTime opened = LocalDateTime.of(2023, Month.JUNE, 23, 02, 7, 00);
        BankAccount account = new BankAccount("Tom", opened, 1000.0f);
        BankAccount newAccount = new BankAccount(account);
        System.out.println(account.toString());
        System.out.println("===============================");
        System.out.println(newAccount.toString());
    }
}
