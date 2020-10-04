import java.util.Locale;
import java.util.Scanner;

/**
 * Author: Rangel
*/

public class RepeticaoCasosTeste {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    for (int i = 1; i <= N; i += 1) {
      float v1 = sc.nextFloat();
      float v2 = sc.nextFloat();
      float v3 = sc.nextFloat();
      float mediaPonderada = 0;
      mediaPonderada = (v1 * 2.0f + v2 * 3.0f + v3 * 5.0f) / 10.0f;
      System.out.printf("%.1f\n", mediaPonderada);
    }

    sc.close();
  }
}

