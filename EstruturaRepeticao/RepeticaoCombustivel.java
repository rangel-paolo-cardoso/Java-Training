import java.util.Scanner;

/**
 * Author: Rangel
*/

public class RepeticaoCombustivel {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int alcool = 0;
    int gasolina = 0;
    int diesel = 0;

    while (true) {
      byte code = sc.nextByte();

      if (code == 4) break;

      switch (code) {
        case 1:
          alcool += 1;
          break;
        case 2:
          gasolina += 1;
          break;
        case 3:
          diesel += 1;
          break;
        default:
          break;
      }
    }

    System.out.println("MUITO OBRIGADO");
    System.out.printf("Alcool: %d\n", alcool);
    System.out.printf("Gasolina: %d\n", gasolina);
    System.out.printf("Diesel: %d\n", diesel);

    sc.close();
  }
}
