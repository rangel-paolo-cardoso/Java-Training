package exercise24;

public class BankingAccount {
    
    private String customerName;
    private int accountNumber;
    private double balance;

    public BankingAccount() {}

    public BankingAccount(String customerName, int accountNumber, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws Exception {
        if (this.getBalance() < amount) {
            throw new Exception("Insufficient funds!");
        } else {
            this.setBalance(this.getBalance() - amount);
        }
    }

    public void deposit(double amount) {
        this.setBalance(this.getBalance() + amount);
    }
}
