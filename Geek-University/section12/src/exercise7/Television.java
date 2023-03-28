package exercise7;

public class Television {
    private boolean on;
    private int channel;
    private int volume;
    private int channelAmount;
    private int maximumVolume;

    public Television() {
        this.channel = 1;
    }

    public Television(boolean on, int channel, int volume, int channelAmount, int maximumVolume) {
        this.on = on;
        this.channel = channel;
        this.volume = volume;
        this.channelAmount = channelAmount;
        this.maximumVolume = maximumVolume;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public void channelUp() {
        if (channel < channelAmount) {
            channel = channel + 1;
        } else {
            channel = 1;
        }
    }

    public void channelDown() {
        if (channel > 1) {
            channel = channel - 1;
        } else {
            channel = channelAmount;
        }
    }

    public void volumeUp() {
        if (volume < maximumVolume) {
            volume = volume + 1;
        } else {
            System.out.println("Maximum volume!");
        }
    }

    public void volumeDown() {
        if (channel > 1) {
            volume = volume - 1;
        } else {
            System.out.println("Minimum volume!");
        }
    }

    @Override
    public String toString() {
        return "----- TV -----"
                + "\nOn: " + on
                + ",\nChannel: " + channel
                + ",\nVolume: " + volume
                + ",\nTotal channels: " + channelAmount
                + ",\nMaximum volume: " + maximumVolume
                + "\n";
    }
}
