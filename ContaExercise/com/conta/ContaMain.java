import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

/**
 * Author: Rangel
 */

public class ContaMain {
  
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Conta conta; // Conta bancária.

    System.out.println("Enter account number: ");
    int accountNumber = sc.nextInt();
    sc.nextLine();

    System.out.println("Enter account holder: ");
    String accountHolder = sc.nextLine();

    System.out.println("Is there an initial deposit (y/n): ");
    char response = sc.next().charAt(0);

    if (response == 'y') {
      System.out.println("Enter initial deposit value: ");
      float initialDeposit = sc.nextFloat();
      conta = new Conta(accountNumber, accountHolder, initialDeposit);
    } else {
      conta = new Conta(accountNumber, accountHolder);
    }
    
    System.out.println("Account data: ");
    System.out.println(conta.toString());

    System.out.println("Enter a deposit value: ");
    conta.deposit(sc.nextFloat());
    System.out.println(conta.toString());

    System.out.println("Enter a withdraw value: ");
    conta.withDraw(sc.nextFloat());
    System.out.println(conta.toString());

    sc.close();
  }
}
