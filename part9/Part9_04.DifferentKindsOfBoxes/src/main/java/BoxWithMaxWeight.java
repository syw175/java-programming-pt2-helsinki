import java.util.ArrayList;
public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public int getCapacity() {
        int remainingCapacity = this.capacity;
        for (Item item : this.items) {
            remainingCapacity -= item.getWeight();
        }
        return remainingCapacity;
    }

    @Override
    public void add(Item item) {
        if (getCapacity()-item.getWeight() < 0) {
            return;
        }
        this.items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}
