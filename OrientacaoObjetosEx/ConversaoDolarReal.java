import java.util.Locale;
import java.util.Scanner;

import utilitarios.CurrencyConverter;

/**
 * Author: Rangel
 */
public class ConversaoDolarReal {

  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    float dollarPrice = 0f, quantity = 0f;

    System.out.print("What is the dollar price? ");
    dollarPrice = sc.nextFloat();

    System.out.print("How many dollars will be bought? ");
    quantity = sc.nextFloat();

    System.out.print(
      "Amount to be paid in reals = "
      + String.format(
          "%.2f\n", CurrencyConverter.dollarToReals(dollarPrice, quantity)
        )
    );

    sc.close();
  }
}