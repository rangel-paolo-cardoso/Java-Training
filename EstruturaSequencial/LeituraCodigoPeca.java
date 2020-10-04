import java.util.Locale;
import java.util.Scanner;

/**
 * Author: Rangel
 */
public class LeituraCodigoPeca {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    /*
      Por questões didáticas
      codigoPeca1 e 2 não serão utilizados.
    */
    int codigoPeca1, numeroDePecas1;
    int codigoPeca2, numeroDePecas2;
    float valorUnitario1, valorUnitario2, total;

    codigoPeca1 = sc.nextInt();
    numeroDePecas1 = sc.nextInt();
    valorUnitario1 = sc.nextFloat();

    codigoPeca2 = sc.nextInt();
    numeroDePecas2 = sc.nextInt();
    valorUnitario2 = sc.nextFloat();

    total = numeroDePecas1 * valorUnitario1 + numeroDePecas2 * valorUnitario2;

    System.out.printf("\nVALOR A PAGAR: %.2f\n", total);

    sc.close();
  }
}
