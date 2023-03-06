package exercise17;

import java.util.Locale;

public class Exercise17 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        double squareFeet = AreaUnitConversation.convertAcresToSquareFeet(5);
        System.out.println(5 + " Acres are equal to " + squareFeet + " square feet");

        double squareCentimeters = AreaUnitConversation.convertSquareFeetToSquareCentimeters(10);
        System.out.println(10 + " squared feet are equal to " + squareCentimeters + " square centimeters");

        double squareFeet2 = AreaUnitConversation.convertSquareMetersToSquareFeet(5);
        System.out.println(5 + " squared meters are equal to " + squareFeet2 + " square feet");

        double acres = AreaUnitConversation.convertSquareMilesToAcres(1000);
        System.out.println(1000 + " sqaured miles are equal to " + acres + " acres");
    }
}
