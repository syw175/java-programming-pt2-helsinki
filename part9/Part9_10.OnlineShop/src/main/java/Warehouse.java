import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> warehousePrices;
    private Map<String, Integer> warehouseStocks;

    public Warehouse() {
        this.warehousePrices = new HashMap<>();
        this.warehouseStocks = new HashMap<>();
    }

    // Adds a product to the warehouse with the price and stock balance given as parameters.
    public void addProduct(String product, int price, int stock) {
        this.warehousePrices.put(product, price);
        this.warehouseStocks.put(product, stock);
    }

    // Returns the price of the product it received as a parameter.
    public int price(String product) {
        return this.warehousePrices.getOrDefault(product, -99);
    }

    // Returns the current remaining stock of the product in the warehouse.
    public int stock(String product) {
        return this.warehouseStocks.getOrDefault(product, 0);
    }

    // Reduces the stock remaining for the product it received as a parameter by one
    public boolean take(String product) {
        if (!this.warehouseStocks.containsKey(product)) {
            return false;
        }
        if (stock(product) <= 0) {
            return false;
        }
        int newStock = stock(product)-1;
        this.warehouseStocks.put(product, newStock);
        return true;
    }

    public Set<String> products() {
        return this.warehousePrices.keySet();
    }
}
