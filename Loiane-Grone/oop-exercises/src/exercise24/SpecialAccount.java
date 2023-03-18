package exercise24;

public class SpecialAccount extends BankingAccount {

    private double limit;

    public SpecialAccount() {
    }

    public SpecialAccount(double limit) {
        this.limit = limit;
    }

    public SpecialAccount(String customerName, int accountNumber, double balance, double limit) {
        super(customerName, accountNumber, balance);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public void withDraw(double amount) throws Exception {
        if (this.getLimit() + this.getBalance() < amount) {
            throw new Exception("Insufficient funds and limit!");
        } else {
            if (this.getBalance() < amount) {
                double aux = amount - this.getBalance();
                this.setBalance(this.getBalance() - this.getBalance());
                this.setLimit(this.getLimit() - aux);
            } else {
                this.setBalance(this.getBalance() - amount);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Limit: " + limit + "\n";
    }
}
