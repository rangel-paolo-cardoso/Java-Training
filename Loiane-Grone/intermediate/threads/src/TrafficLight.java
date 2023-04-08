public class TrafficLight {
    public static void main(String[] args) throws Exception {

        TrafficLightThread trafficLightThread = new TrafficLightThread();

        for (int i = 0; i < 10; i++) {
            System.out.println(trafficLightThread.getColor());
            trafficLightThread.waitColorChange();
        }

        trafficLightThread.turnOffTrafficLight();
        System.out.println("Terminou");

    }
}
