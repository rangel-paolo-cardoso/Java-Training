import java.util.Locale;
import java.util.Scanner;

/**
 * Author: Rangel
 */
public class ExercicioRetangulo {

  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Retangulo rec = new Retangulo();
    System.out.println("Enter rectangle width and height:");
    rec.height = sc.nextDouble();
    rec.width = sc.nextDouble();

    System.out.println(rec.toString());

    sc.close();
  }
}