import orders.Product;

import java.time.Instant;

public class Main {

    public static void main(String[] args) {

        Product p = Product.create(
                        "Manteiga Qualis",
                        10.0,
                        3
                ).update(
                        "Carne de Lata",
                        10.0
                ).incrementQty(10)
                .decrementQty(13);

        System.out.println(p.name());
        System.out.println(p.price());
        System.out.println(p.qty());
        System.out.println(p.createdAt());

    }

}
