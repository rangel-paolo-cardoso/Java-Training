import java.util.Scanner;

/**
 * Author: Rangel
 */

public class CondicionalHoraDoJogo {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    byte horaInicial, horaFinal, totalHoras;

    horaInicial = sc.nextByte();
    horaFinal = sc.nextByte();

    if (horaInicial > horaFinal) {
      totalHoras = (byte) (24 - horaInicial + horaFinal);
    } else if (horaInicial == horaFinal) {
      totalHoras = 24;
    } else {
      totalHoras = (byte) (horaFinal - horaInicial);
    }

    System.out.printf("O JOGO DUROU %d HORA(S)\n", totalHoras);

    sc.close();
  }
}
