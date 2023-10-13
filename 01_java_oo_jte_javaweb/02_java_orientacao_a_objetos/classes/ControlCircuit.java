package classes;

import interfaces.ButtonsControlModel1;
import interfaces.ExpoeAttributesControlModel1;

public class ControlCircuit implements ButtonsControlModel1, ExpoeAttributesControlModel1 {
    private int channel;
    private int volume;
    private int max_channel;
    private int min_channel;
    private int max_volume;
    private int min_volume;

    public ControlCircuit(int max_channel, int min_channel, int max_volume, int min_volume) {
        this.max_channel = max_channel;
        this.min_channel = min_channel;
        this.max_volume = max_volume;
        this.min_volume = min_volume;
        this.volume = max_volume / 2;
        this.channel = max_channel / 2;
    }

    @Override
    public void informTheChannel(int channel) {
        if (channel > this.max_channel) {
            this.channel = max_channel;
        } else if (channel < this.min_channel) {
            this.channel = this.min_channel;
        } else {
            this.channel = channel;
        }
    }

    @Override
    public void goUpChannel() {
        if (!(this.channel + 1 > this.max_channel)) {
            this.channel++;
        } else {
            this.channel = this.min_channel;
        }
    }

    @Override
    public void goDownChannel() {
        if (!(this.channel - 1 < this.min_channel)) {
            this.channel--;
        } else {
            this.channel = this.max_channel;
        }
    }

    @Override
    public void goUpVolume() {
        if (!(this.volume + 1 > this.max_volume)) {
            this.volume++;
        } else {
            this.volume = this.min_volume;
        }
    }

    @Override
    public void goDownVolume() {
        if (!(this.volume - 1 < this.min_volume)) {
            this.volume--;
        } else {
            this.volume = this.max_volume;
        }
    }

    @Override
    public void showChannel() {
        System.out.println("Canal atual: " + channel);
    }

    @Override
    public void showVolume() {
        System.out.println("Volume atual: " + volume);
    }
}
