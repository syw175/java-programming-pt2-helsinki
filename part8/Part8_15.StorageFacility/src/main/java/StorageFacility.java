import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> units;

    public StorageFacility() {
        this.units = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.units.putIfAbsent(unit, new ArrayList<>());
        this.units.get(unit).add(item);
    }

    public ArrayList<String> contents(String unit) {
        return this.units.getOrDefault(unit, new ArrayList<>());
    }

    public void remove(String unit, String item) {
        this.units.get(unit).remove(item);
        if (this.units.get(unit).isEmpty()) {
            this.units.remove(unit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>(this.units.keySet());
        return units;
    }
}
