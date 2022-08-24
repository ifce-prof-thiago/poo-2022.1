package orders;

public class Product {

    private String name;
    private double price;
    private int qty;

    public Product(String newName, double newPrice, int newQty) {
        name = newName;
        price = newPrice;
        qty = newQty;

        this.validate();
    }

    public void update(String newName, double mewPrice) {
        name = newName;
        price = mewPrice;

        this.validate();
    }

    public void incrementQty(int n) {
        qty += n;
        this.validate();
    }

    public void decrementQty(int n) {
        qty -= n;
        this.validate();
    }

    private void validate() {
        if (name == null || name.length() < 2) {
            throw new RuntimeException("'name' is invalid");
        }

        if (price < 0.0) {
            throw new RuntimeException("'price' is invalid!");
        }

        if (qty < 0) {
            throw new RuntimeException("'qty' is invalid!");
        }
    }

    public String name() {
        return name;
    }

    public double price() {
        return price;
    }

    public int qty() {
        return qty;
    }

}
