package exercise18;

public class VolumeUnitConversation {
    
    static private int litersToCubicCentimeters = 1000;
    static private int cubicMetersToLiters = 1000;
    static private double cubicMetersToCubicFeet = 35.32;
    static private int americanGallonToCubicInches = 231;
    static private double americanGallonToLiters = 3.785;

    static public double convertLitersToCubicCentimeters(double liters) {
        return liters * litersToCubicCentimeters;
    }

    static public double convertCubicMetersToLiters(double cubicMeters) {
        return cubicMeters * cubicMetersToLiters;
    }

    static public double convertCubicMetersToCubicFeet(double cubicMeters) {
        return cubicMeters * cubicMetersToCubicFeet;
    }

    static public double convertAmericanGallonToCubicInches(double americanGallon) {
        return americanGallon * americanGallonToCubicInches;
    }

    static public double convertAmericanGallonToLiters(double americanGallon) {
        return americanGallon * americanGallonToLiters;
    }
}
