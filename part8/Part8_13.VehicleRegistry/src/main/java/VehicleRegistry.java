import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    // assigns the owner it received as a parameter to a car
    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.registry.containsKey(licensePlate)) {
            this.registry.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    // returns the owner of the car corresponding to the license plate
    public String get(LicensePlate licensePlate) {
        return this.registry.getOrDefault(licensePlate, null);
    }

    // removes the license plate and attached data from the registry.
    public boolean remove(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) {
            this.registry.remove(licensePlate);
            return true;
        }
        return false;
    }

    // prints the license plates in the registry.
    public void printLicensePlates() {
        for (LicensePlate plate : this.registry.keySet()) {
            System.out.println(plate);
        }
    }

    // prints the owners of the cars in the registry.
    public void printOwners() {
        ArrayList<String> printedOwners = new ArrayList<>();

        for (LicensePlate plate : this.registry.keySet()) {
            String owner = this.registry.get(plate);
            if (!printedOwners.contains(owner)) {
                System.out.println(owner);
                printedOwners.add(owner);
            }
        }
    }
}
