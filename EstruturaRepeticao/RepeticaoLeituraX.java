import java.util.Scanner;

/**
 * Author: Rangel
*/

public class RepeticaoLeituraX {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int X = sc.nextInt();
    int in = 0, out = 0;

    for (int i = 1; i <= X; i += 1) {
      int number = sc.nextInt();
      if (number >= 10 && number <= 20) in += 1;
      else out += 1;
    }

    System.out.printf("\n%d in\n", in);
    System.out.printf("%d out\n", out);

    sc.close();
  }
}
