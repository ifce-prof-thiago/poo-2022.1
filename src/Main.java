import orders.Product;

public class Main {

    public static void main(String[] args) {

        Product p = new Product(
                "Manteiga Qualis",
                10.0,
                3
        );

        p.update(
                "Carne de Lata",
                10.0
        );

        p.incrementQty(10);

        p.decrementQty(13);

        System.out.println(p.name());
        System.out.println(p.price());
        System.out.println(p.qty());

    }

}
