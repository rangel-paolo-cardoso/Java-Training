/**
 * Author: Rangel
*/

public class Aluno {
  
  public String name;
  public double nota1;
  public double nota2;
  public double nota3;
  public double total;

  public boolean validaNotas(double n1, double n2, double n3) {
    return n1 <=30 && n2 <= 35 && n3 <=35;
  }

  public double notaTotal() {
    if (validaNotas(nota1, nota2, nota3)) {
      this.total = nota1 + nota2 + nota3;
    }
    return this.total;
  }

  public void montaResultado(String frase) {
    System.out.println("FINAL GRADE = " + String.format("%.2f", this.total));
    System.out.println(frase);
  }

  public void resultado() {
    if (notaTotal() >= 60) {
      montaResultado("PASS");
    } else {
      montaResultado("FAILED");
      System.out.printf("MISSING %.2f POINTS\n", (60 - this.total));
    }
  }
}
