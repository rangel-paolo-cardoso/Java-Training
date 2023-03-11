package exercise4;

public class Television {
    
    private int currentChannel;
    private int volume;
    private int totalChannels;
    private boolean isOn;

    public Television() {
        initilizeTV();
        // remoteControl = new RemoteControl();
    }

    private void initilizeTV() {
        this.isOn = false;
        this.currentChannel = 0;
        this.totalChannels = 100;
        this.volume = 0;
    }

    public void increaseVolume() {
        if (verifyTVStatus()) {
            if (this.volume < 100) {
                setVolume(this.volume + 1);
            } else {
                System.out.println("Maximum volume!");
            }
        }
    }

    public void decreaseVolume() {
        if (verifyTVStatus()) {
            if (this.volume > 0) {
                setVolume(this.volume - 1);
            } else {
                System.out.println("Mininum volume!");
            }
        }
    }

    public void increaseChannel() {
        if (verifyTVStatus()) {
            if (this.currentChannel < this.totalChannels) {
                setChannel(this.currentChannel + 1);
            } else {
                System.out.println("Last channel!");
            }
        }
    }

    public void decreaseChannel() {
        if (verifyTVStatus()) {
            if (this.currentChannel > 0) {
                setChannel(this.currentChannel - 1);
            } else {
                System.out.println("First channel!");
            }
        }
    }

    public void setChannel(int channel) {
        if (verifyTVStatus()) {
            if (channel >= 0 || channel <= 100) {
                this.currentChannel = channel;
            }
        }
    }

    public int getCurrentChannel() {
        if (this.isOn) {
            return this.currentChannel;
        }
        return -1;
    }

    public int getVolume() {
        if (this.isOn) {
            return volume;
        }
        return -1;
    }

    private void setVolume(int volume) {
        if (verifyTVStatus()) {
            this.volume = volume;
        }
    }

    public int getTotalChannels() {
        if (this.isOn) {
            return this.totalChannels;
        }
        return -1;
    }

    // public void setTotalChannels(int totalChannels) {
    //     this.totalChannels = totalChannels;
    // }

    public boolean isOn() {
        return this.isOn;
    }

    public void setOn() {
        this.isOn = !this.isOn;
    }

    private boolean verifyTVStatus() {
        if (!this.isOn) {
            System.out.println("The TV is off!");
            return false;
        }
        return true;
    }
}
