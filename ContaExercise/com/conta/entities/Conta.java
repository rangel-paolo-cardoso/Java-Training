package entities;

public class Conta {
  
  private int accountNumber;
  private String accountHolder;
  private float accountValue ;

  public Conta(int accountNumber, String accountHolder) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
  }

  public Conta(int accountNumber, String accountHolder, float accountValue) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.accountValue = accountValue;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public String getAccountHolder() {
    return accountHolder;
  }

  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
  }

  @Override
  public String toString() {
    System.out.println("Updated account data:");
    return "Account " + accountNumber +
      ", Holder: " + accountHolder +
      ", Balance: " + accountValue;
  }

  public void deposit(float value) {
    this.accountValue += value;
    toString();
  }

  public void withDraw(float value) {
    this.accountValue -= value + 5;
    toString();
  }

}
