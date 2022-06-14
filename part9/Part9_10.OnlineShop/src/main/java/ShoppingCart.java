import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        this.cart.putIfAbsent(product, new Item(product, 0, price));
        this.cart.get(product).increaseQuantity();
    }

    public int price() {
        int cartTotal = 0;
        for (Item product : this.cart.values()) {
            cartTotal += product.price();
        }
        return cartTotal;
    }

    public void print() {
        for (Item item : this.cart.values()) {
            System.out.println(item);
        }
    }
}
