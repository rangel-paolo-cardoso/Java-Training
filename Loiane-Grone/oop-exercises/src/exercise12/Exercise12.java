package exercise12;

import java.util.Locale;

public class Exercise12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        CheckingsAccount checkingsAccount = new CheckingsAccount();
        checkingsAccount.setNumber(1001);
        checkingsAccount.setBalance(500.00);
        checkingsAccount.setSpecial(true);
        if (checkingsAccount.isSpecial()) {
            checkingsAccount.setOverdraft(500.00);
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
