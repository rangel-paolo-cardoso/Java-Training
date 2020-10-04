import java.util.Locale;
import java.util.Scanner;

/**
 * Author: Rangel
 */
public class LeituraGeometrica {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    float A, B, C;
    float areaTrianguloRetangulo;
    float areaCirculo, pi = 3.14159f;
    float areaTrapezio;
    float areaQuadrado, areaRetangulo;

    A = sc.nextFloat();
    B = sc.nextFloat();
    C = sc.nextFloat();

    // Base A, Altura C.
    areaTrianguloRetangulo = (A * C) / 2;
    // Círculo de raio C.
    areaCirculo = pi * C * C;
    // Trapézio de bases A e B e altura C.
    areaTrapezio = ((A + B) * C) / 2;
    // Quadrado de lado B.
    areaQuadrado = B * B;
    // Retângulo de lados A e B.
    areaRetangulo = A * B;

    System.out.printf("TRIANGULO %.3f\n", areaTrianguloRetangulo);
    System.out.printf("CIRCULO %.3f\n", areaCirculo);
    System.out.printf("TRAPEZIO %.3f\n", areaTrapezio);
    System.out.printf("QUADRADO %.3f\n", areaQuadrado);
    System.out.printf("RETANGULO %.3f\n", areaRetangulo);

    sc.close();
  }
}
