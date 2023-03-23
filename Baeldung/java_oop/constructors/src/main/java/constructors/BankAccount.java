package constructors;

import java.time.LocalDateTime;

public class BankAccount {
    String name;
    LocalDateTime opened;
    double balance;

    public BankAccount() {
        this.name = "";
        this.opened = LocalDateTime.now();
        this.balance = 0.0d;
    }

    public BankAccount(String name, LocalDateTime opened, double balance) {
        this.name = name;
        this.opened = opened;
        this.balance = balance;
    }

    public BankAccount(BankAccount other) {
        this.name = other.name;
        this.opened = LocalDateTime.now();
        this.balance = 0.0d;
    }

    public BankAccount(String name) {
        this(name, LocalDateTime.now(), 0.0d);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getOpened() {
        return opened;
    }

    public void setOpened(LocalDateTime opened) {
        this.opened = opened;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %f",
                this.name, this.opened.toString(), this.balance);
    }
}
