package utilitarios;

/**
 * Author: Rangel
*/

public class CurrencyConverter {
  
  public static double dollarToReals(double price, double quantity) {
    return (price * quantity) + (price * quantity) * 0.06;
  }
}
