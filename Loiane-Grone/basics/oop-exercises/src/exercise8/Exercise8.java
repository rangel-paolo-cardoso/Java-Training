package exercise8;

import java.util.Locale;

public class Exercise8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        CheckingsAccount checkingsAccount = new CheckingsAccount();
        checkingsAccount.number = 1001;
        checkingsAccount.balance = 500.00;
        checkingsAccount.special = true;
        if (checkingsAccount.special) {
            checkingsAccount.overdraft = 500.00;
        }

        checkingsAccount.checkBalance();
        checkingsAccount.checkIfUsingOverdraft();
        checkingsAccount.deposit(500.00);
        checkingsAccount.checkBalance();
        checkingsAccount.withdraw(700.00);
        checkingsAccount.checkBalance();
        checkingsAccount.withdraw(400.00);
        checkingsAccount.checkBalance();
        checkingsAccount.checkIfUsingOverdraft();
        checkingsAccount.withdraw(500.00);
    }
}
