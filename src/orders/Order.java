package orders;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String number;
    private List<Item> items;

    private Order(String aNumber, List<Item> aProducts) {
        this.number = aNumber;
        this.items = aProducts;
    }

    public static Order create() {

        return new Order(
                GenerateOrderNumber.generate(),
                new ArrayList<>()
        );

    }

    public void addItem(Item aProduct) {
        items.add(aProduct);
    }

    public String getNumber() {
        return number;
    }

    public int getQtyItems() {

        return items.stream()
                .mapToInt(i -> i.getQty())
                .sum();

    }

    public List<Item> getItems() {
        return items;
    }

}
