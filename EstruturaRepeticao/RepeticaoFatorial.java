import java.util.Scanner;

/**
 * Author: Rangel
*/

public class RepeticaoFatorial {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int fatorial = 1;

    for (int i = N; i > 1; i -= 1) {
      fatorial *= i;
    }

    System.out.println(fatorial);

    sc.close();
  }
}
