package exercise18;

import java.util.Locale;

public class Exercise18 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        double cubicCentimeters = VolumeUnitConversation.convertLitersToCubicCentimeters(5);
        System.out.println(5 + " Liters are equal to " + cubicCentimeters + " cubic centimeters");

        double liters = VolumeUnitConversation.convertCubicMetersToLiters(10);
        System.out.println(10 + " cubic meters are equal to " + liters + " liters");

        double cubicFeet = VolumeUnitConversation.convertCubicMetersToCubicFeet(5);
        System.out.println(5 + " cubic meters are equal to " + cubicFeet + " cubic feet");

        double cubicInches = VolumeUnitConversation.convertAmericanGallonToCubicInches(1000);
        System.out.println(1000 + " American gallons are equal to " + cubicInches + " cubic inches");

        double liters2 = VolumeUnitConversation.convertAmericanGallonToLiters(1000);
        System.out.println(1000 + " American gallons are equal to " + liters2 + " liters");
    }
}
