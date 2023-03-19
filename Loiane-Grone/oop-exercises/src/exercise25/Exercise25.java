package exercise25;

import java.util.Locale;
import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Legal Person instances
        LegalPerson l1 = new LegalPerson("Candy Claus");
        System.out.print("Enter the gross income for " + l1 + ": ");
        System.out.printf("Total income tax payment: %.2f\n", l1.calculateIncomeTax(sc.nextDouble()));

        LegalPerson l2 = new LegalPerson("Fluffy's Bakery");
        System.out.print("Enter the gross income for " + l2 + ": ");
        System.out.printf("Total income tax payment: %.2f\n", l2.calculateIncomeTax(sc.nextDouble()));

        LegalPerson l3 = new LegalPerson("Josh's Book store");
        System.out.print("Enter the gross income for " + l3 + ": ");
        System.out.printf("Total income tax payment: %.2f\n", l3.calculateIncomeTax(sc.nextDouble()));

        // Natural Person instances
        NaturalPerson n1 = new NaturalPerson("Carlos");
        System.out.print("Enter the gross income for " + n1 + ": ");
        System.out.printf("Total income tax payment: %.2f\n", n1.calculateIncomeTax(sc.nextDouble()));

        NaturalPerson n2 = new NaturalPerson("James");
        System.out.print("Enter the gross income for " + n2 + ": ");
        System.out.printf("Total income tax payment: %.2f\n", n2.calculateIncomeTax(sc.nextDouble()));

        NaturalPerson n3 = new NaturalPerson("Chris");
        System.out.print("Enter the gross income for " + n3 + ": ");
        System.out.printf("Total income tax payment: %.2f\n", n3.calculateIncomeTax(sc.nextDouble()));

        sc.close();
    }

    // static void printIncomeTaxPayment(TaxPayer taxpayer) {
    //     System.out.println(ac);
    // }
}
