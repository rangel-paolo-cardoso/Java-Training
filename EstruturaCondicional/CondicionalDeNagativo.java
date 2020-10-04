import java.util.Scanner;

/**
 * Author: Rangel
 */
public class CondicionalDeNagativo {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int number = sc.nextInt();

    if (number < 0 ) {
      System.out.println("NEGATIVO");
    } else {
      System.out.println("NÃO NEGATIVO");
    }

    sc.close();
  }
}