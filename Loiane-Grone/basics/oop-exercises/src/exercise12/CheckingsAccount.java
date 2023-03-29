package exercise12;

public class CheckingsAccount {
    
    private int number;
    private double balance;
    private boolean special;
    private double overdraft;

    public CheckingsAccount() {}    

    public CheckingsAccount(int number, double balance, boolean special, double overdraft) {
        this.number = number;
        this.balance = balance;
        this.special = special;
        this.overdraft = overdraft;
    }

    public void withdraw(double value) {
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

    public void deposit(double value) {
        balance += value;
    }

    public void checkBalance() {
        System.out.printf("Your balance is $ %.2f\n", balance);
        System.out.printf("Your overdraft is %.2f\n", overdraft);
    }

    public void checkIfUsingOverdraft() {
        if (balance == 0.0) {
            System.out.println("You are using your overdraft.");
        } else {
            System.out.println("You are not using your overdraft.");
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
}
