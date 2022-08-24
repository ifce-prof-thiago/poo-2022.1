package orders;

import java.time.Instant;

public class Product {

    private String name;
    private double price;
    private int qty;
    private final Instant createdAt;


    private Product(
            String name,
            double price,
            int qty,
            Instant createdAt) {

        this.name = name;
        this.price = price;
        this.qty = qty;
        this.createdAt = createdAt;

        this.validate();
    }

    public static Product create(String newName, double newPrice, int newQty) {

        return new Product(newName, newPrice, newQty, Instant.now());

    }

    public Product update(String newName, double mewPrice) {
        name = newName;
        price = mewPrice;

        this.validate();

        return this;
    }

    public Product incrementQty(int n) {
        qty += n;
        this.validate();

        return this;
    }

    public Product decrementQty(int n) {
        qty -= n;
        this.validate();

        return this;
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

    public Instant createdAt() {
        return createdAt;
    }

}
