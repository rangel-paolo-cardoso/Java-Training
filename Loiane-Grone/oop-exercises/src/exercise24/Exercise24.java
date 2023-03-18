package exercise24;

import java.util.Locale;
import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        BankingAccount account = new BankingAccount(
            "Customer 1",
            1_001,
            1_500.50
        );
        SavingsAccount savingsAccount = new SavingsAccount(
            "Customer 2",
            1_001,
            2_500.50,
            0.02
        );
        SpecialAccount specialAccount = new SpecialAccount(
            "Customer 3",
            1_001,
            2_500.50,
            200.00
        );

        account.withdraw(1_000.00);
        savingsAccount.withdraw(2_000.00);
        specialAccount.withdraw(2_000.00);

        printAccounts(account, savingsAccount, specialAccount);

        account.deposit(500.00);
        savingsAccount.deposit(300.00);
        specialAccount.deposit(300.00);

        printAccounts(account, savingsAccount, specialAccount);

        savingsAccount.calculateNewSalary(1.09);
        System.out.println(savingsAccount);

        sc.close();
    }

    static void printAccounts(BankingAccount ac, BankingAccount sc, BankingAccount spc) {
        System.out.println(ac);
        System.out.println(sc);
        System.out.println(spc);
    }
}
