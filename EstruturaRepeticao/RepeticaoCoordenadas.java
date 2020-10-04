import java.util.Scanner;

/**
 * Author: Rangel
 */

public class RepeticaoCoordenadas {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    float X = sc.nextFloat();
    float Y = sc.nextFloat();

    while (X != 0 && Y != 0) {
      if (X > 0 && Y > 0)
        System.out.println("primeiro");
      else if (X < 0 && Y > 0)
        System.out.println("segundo");
      else if (X < 0 && Y < 0)
        System.out.println("terceiro");
      else
        System.out.println("quarto");

      X = sc.nextFloat();
      Y = sc.nextFloat();
    }

    sc.close();
  }
}
