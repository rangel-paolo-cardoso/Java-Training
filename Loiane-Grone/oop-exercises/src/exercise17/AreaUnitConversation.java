package exercise17;

public class AreaUnitConversation {
    
    static private double squareMeterToSquareFeet = 10.76;
    static private int squareFootToSquareCentimeters = 929;
    static private int squareMileToAcres = 640;
    static private int acreToSquareFeet = 43_560;

    public static double convertSquareMetersToSquareFeet(int meters) {
        return meters * squareMeterToSquareFeet;
    }

    public static double convertSquareFeetToSquareCentimeters(int feet) {
        return feet * squareFootToSquareCentimeters;
    }

    public static double convertSquareMilesToAcres(int miles) {
        return miles * squareMileToAcres;
    }

    public static double convertAcresToSquareFeet(int acres) {
        return acres * acreToSquareFeet;
    }
}
