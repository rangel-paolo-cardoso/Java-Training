package exercise4;

public class RemoteControl {
    
    private Television tv;

    public RemoteControl(Television tv) {
        this.tv = tv;
    }

    public void turnTVOnOff() {
        tv.setOn();
    }

    public void increaseVolume() {
        tv.increaseVolume();
    }

    public void decreaseVolume() {
        tv.decreaseVolume();
    }

    public void increaseChannel() {
        tv.increaseChannel();
    }

    public void decreaseChannel() {
        tv.decreaseChannel();
    }

    public void setChannel(int channel) {
        tv.setChannel(channel);
    }

    public void getCurrentChannel() {
        System.out.println("Current channel: " + tv.getCurrentChannel());
    }

    public void getVolume() {
        System.out.println("Volume: " + tv.getVolume());
    }

    public void getTotalChannels() {
        System.out.println("Total channels: " + tv.getTotalChannels());
    }
}
