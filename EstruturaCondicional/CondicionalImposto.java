import java.util.Locale;
import java.util.Scanner;

/**
 * Author: Rangel
*/

public class CondicionalImposto {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    float salario = sc.nextFloat();
    float valorIncidente, imposto = 0;

    if (salario <= 2000) System.out.println("Isento");
    else {
      valorIncidente = salario - 2000;
      if (valorIncidente <= 1000) imposto += valorIncidente * 0.08;
      if (valorIncidente <= 2500) {
        imposto += 1000 * 0.08;
        valorIncidente -= 1000;
        imposto += valorIncidente * 0.18;
      } else {
        imposto += 1000 * 0.08;
        valorIncidente -= 1000;
        imposto += 1500 * 0.18;
        valorIncidente -= 1500;
        imposto += valorIncidente * 0.28;
      }
    }

    if (imposto != 0) System.out.printf("\n%.2f\n", imposto);

    sc.close();
  }
}
