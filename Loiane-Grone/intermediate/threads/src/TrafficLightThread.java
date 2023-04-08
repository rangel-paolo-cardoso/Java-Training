public class TrafficLightThread implements Runnable {

    private TrafficLightColor color;
    private boolean stop;
    private boolean changedColor;

    public TrafficLightThread() {
        this.color = TrafficLightColor.RED;
        this.stop = false;
        this.changedColor = false;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!stop) {
            try {
                Thread.sleep(this.color.getWaitingTime());
                changeColor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void changeColor() {
        switch (this.color) {
            case RED:
                this.color = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                this.color = TrafficLightColor.RED;
                break;
            case GREEN:
                this.color = TrafficLightColor.YELLOW;
                break;
            default:
                break;
        }
        this.changedColor = true;
        notify();
    }

    public synchronized void waitColorChange() {
        while (!changedColor) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.changedColor = false;
    }

    public synchronized void turnOffTrafficLight() {
        this.stop = true;
    }

    public TrafficLightColor getColor() {
        return color;
    }

    // public void setColor(TrafficLightColor color) {
    //     this.color = color;
    // }
}
