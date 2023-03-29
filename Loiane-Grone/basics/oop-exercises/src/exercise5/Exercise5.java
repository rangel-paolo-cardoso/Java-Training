package exercise5;

import java.util.Locale;

public class Exercise5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        CheckingAccount account = new CheckingAccount();

        account.number = 10101;
        account.balance = 5_000.00d;
        account.special = false;
        account.limit = 4_500.00d;

        System.out.println("Number: " + account.number);
        System.out.println("Balance: " + account.balance);
        System.out.println("Special? " + account.special);
        System.out.println("Limit: " + account.limit);
    }
}
