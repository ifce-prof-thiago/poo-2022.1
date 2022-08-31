package inheritance.bank;

public class Main {

    public static void main(String[] args) {

        var current = new CurrentAccount("0090816");
        var savings = new SavingsAccount("0090816");

        System.out.println(current.number());
        System.out.println(savings.number());

    }
}
