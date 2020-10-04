import java.util.Locale;
import java.util.Scanner;

/**
 * Author: Rangel
 */

public class CondicionalContaAPagar {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int codigoProduto = 0;
    short quantidadeProduto = 0;
    float total = 0;

    codigoProduto = sc.nextInt(10);
    quantidadeProduto = sc.nextShort(10);

    if (codigoProduto == 1) total = quantidadeProduto * 4;
    else if (codigoProduto == 2) total = (float) (quantidadeProduto * 4.5);
    else if (codigoProduto == 3) total = quantidadeProduto * 5;
    else if (codigoProduto == 4) total = quantidadeProduto * 2;
    else total = (float) (quantidadeProduto * 1.5);

    System.out.printf("Total: %.2f\n", total);

    sc.close();
  }
}
