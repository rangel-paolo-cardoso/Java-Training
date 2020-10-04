import java.util.Scanner;

/**
 * Author: Rangel
 */
public class RepeticaoSenha {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int senha = 0;

    while (senha != 2002) {
      senha = sc.nextInt();
      System.out.println(
        (senha == 2002) ? "Acesso Permitido": "Senha Invalida"
      );
    }

    sc.close();
  }
}