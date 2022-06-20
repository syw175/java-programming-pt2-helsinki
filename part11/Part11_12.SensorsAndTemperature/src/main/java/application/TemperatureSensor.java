package application;
import java.util.Random;

public class TemperatureSensor  implements Sensor {
    private boolean online;

    public TemperatureSensor() {
        this.online = false;
    }

    public boolean isOn() {
        return this.online;
    }

    public void setOn() {
        this.online = true;
    }

    public void setOff() {
        this.online = false;
    }

    public int read() throws Exception {
        if (!this.online) {
            throw new IllegalStateException();
        }
        return new Random().nextInt(61)-30;
    }
}
