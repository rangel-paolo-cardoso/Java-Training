package exercise24;

public class SavingsAccount extends BankingAccount {
    
    private double dailyIncome;

    public SavingsAccount() {}

    public SavingsAccount(double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    public SavingsAccount(String customerName, int accountNumber, double balance, double dailyIncome) {
        super(customerName, accountNumber, balance);
        this.dailyIncome = dailyIncome;
    }

    public double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    public void calculateNewSalary(double incomeRate) {
        this.setBalance(this.getBalance() + this.getBalance() * incomeRate);
    }
}
