package orders;

public class Main {

    public static void main(String[] args) {

        final var mouse = Product.create(
                "Mouse Ryz",
                280.0, 1000
        );

        final var teclado = Product.create(
                "Tec Gamer Top",
                400,
                20
        );


        final var order = Order.create();
        order.addItem(Item.create(2, mouse));
        order.addItem(Item.create(3, teclado));


        System.out.println(order.getNumber());

        order.getItems().forEach(p -> {
            System.out.println(p.getName());
            System.out.println(p.getPrice());
            System.out.println(p.getQty());
        });

        System.out.println("-------------------");
        System.out.println("Quantidade de items: " + order.getQtyItems());
    }


}

