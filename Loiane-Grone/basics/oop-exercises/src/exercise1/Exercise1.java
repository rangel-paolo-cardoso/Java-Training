package exercise1;

public class Exercise1 {
    public static void main(String[] args) throws Exception {
        // This exercise does not consider the use of encapsulation
        // It's just the creating of classes
        Bulb bulb = new Bulb();

        bulb.brand = "elgin";
        bulb.reference = "48BLED2F09YU";
        bulb.model = "Bulbo A60";
        bulb.type = "LED";
        bulb.socketType = "E27";
        bulb.power = "9W";
        bulb.lightColor = "White";
        bulb.colorTemperature = "6500K";
        bulb.luminousFlux = "600LM";
        bulb.lifespan = 15_000;
        bulb.openingAngle = 200.00;
        bulb.frequency = "50/60HZ";
        bulb.voltage = "Bivolt";
        bulb.energyEfficiency = "90lm/W";
    }
}
