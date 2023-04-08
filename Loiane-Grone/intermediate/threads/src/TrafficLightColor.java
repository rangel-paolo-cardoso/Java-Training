public enum TrafficLightColor {

    GREEN(3000), YELLOW(1000), RED(1500);

    private int waitingTime;

    TrafficLightColor(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getWaitingTime() {
        return waitingTime;
    }
}
