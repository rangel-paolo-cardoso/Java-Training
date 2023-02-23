package exercise8;

public class CheckingsAccount {
    
    int number;
    double balance;
    boolean special;
    double overdraft;

    void withdraw(double value) {
        if (value < balance) {
            balance -= value;
        } else if (value < balance + overdraft) {
            double difference = value - balance;
            balance -= (balance != 0) ? value - difference : 0.0;
            overdraft -= difference;
        } else {
            System.out.println("You cannot withdraw money! The limit has been reached.");
        }
    }

    void deposit(double value) {
        balance += value;
    }

    void checkBalance() {
        System.out.printf("Your balance is $ %.2f\n", balance);
        System.out.printf("Your overdraft is %.2f\n", overdraft);
    }

    void checkIfUsingOverdraft() {
        if (balance == 0.0) {
            System.out.println("You are using your overdraft.");
        } else {
            System.out.println("You are not using your overdraft.");
        }
    }
}
