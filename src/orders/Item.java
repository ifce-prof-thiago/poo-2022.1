package orders;

public class Item {

    private int qty;
    private String name;
    private double price;

    private Item(String aName, int aQty, double aPrice) {
        this.name = aName;
        this.qty = aQty;
        this.price = aPrice;
    }

    public static Item create(int aQty, Product aProduct) {
        return new Item(aProduct.getName(), aQty, aProduct.getPrice());
    }

    public int getQty() {
        return qty;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
