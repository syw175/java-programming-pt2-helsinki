import java.util.ArrayList;
public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        if (this.weight() + item.weight() <= this.capacity) {
            this.items.add(item);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable item : items) {
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Box: %d items, total weight %.1f kg", this.items.size(), weight());
    }
}
