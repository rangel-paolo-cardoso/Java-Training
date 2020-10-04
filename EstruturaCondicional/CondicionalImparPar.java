import java.util.Scanner;

/**
 * Author: Rangel
 */

public class CondicionalImparPar {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int number = sc.nextInt();

    System.out.println((number % 2 == 0) ? "PAR": "IMPAR");

    sc.close();
  }
}
