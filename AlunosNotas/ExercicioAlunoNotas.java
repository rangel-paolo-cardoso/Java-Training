import java.util.Locale;
import java.util.Scanner;

/**
 * Author: Rangel
 */
public class ExercicioAlunoNotas {

  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Aluno aluno = new Aluno();
    aluno.name = sc.nextLine();
    aluno.nota1 = sc.nextDouble();
    aluno.nota2 = sc.nextDouble();
    aluno.nota3 = sc.nextDouble();

    aluno.resultado();

    sc.close();
  }
}