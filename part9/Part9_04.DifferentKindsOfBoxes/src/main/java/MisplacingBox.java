import java.util.ArrayList;
public class MisplacingBox extends Box {
    private ArrayList<Item> items;

    public MisplacingBox() {
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item newItem) {
        this.items.add(newItem);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
