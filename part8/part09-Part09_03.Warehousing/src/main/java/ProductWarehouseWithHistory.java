public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory warehouseHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.warehouseHistory = new ChangeHistory();
        addToWarehouse(initialBalance);
    }

    public String history() {
        return this.warehouseHistory.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.warehouseHistory.add(getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double received = super.takeFromWarehouse(amount);
        this.warehouseHistory.add(getBalance());
        return received;
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName() + "\nHistory: " + history() +
                            "\nLargest amount of product: " + this.warehouseHistory.maxValue() +
                            "\nSmallest amount of product: " + this.warehouseHistory.minValue() +
                            "\nAverage: " + this.warehouseHistory.average());
    }
}
