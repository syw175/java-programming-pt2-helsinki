package application;
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensorsAvail;
    private ArrayList<Integer> allReadings;

    public AverageSensor() {
        this.sensorsAvail = new ArrayList<>();
        this.allReadings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        sensorsAvail.add(toAdd);
    }

    public boolean isOn() {
        for (Sensor sensor : sensorsAvail) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    public void setOn() {
        for (Sensor sensor : sensorsAvail) {
            sensor.setOn();
        }
    }

    public void setOff() {
        for (Sensor sensor : sensorsAvail) {
            sensor.setOff();
        }
    }

    public int read() throws Exception {
        if (!this.isOn() || this.sensorsAvail.isEmpty()) {
            throw new IllegalStateException("No sensors are available");
        }

        int sum = 0;
        for (Sensor sensor : sensorsAvail) {
            sum += sensor.read();
        }
        int avg = sum/this.sensorsAvail.size();
        this.allReadings.add(avg);
        return avg;
    }

    public List<Integer> readings() {
        return this.allReadings;
    }
}
