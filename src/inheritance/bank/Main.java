package inheritance.bank;

public class Main {

    public static void main(String[] args) {

        var current = new CurrentAccount("0090816", 100);

        current.deposit(600);

        current.withdraw(500);

        current.withdraw(150);

        System.out.println(current.balance());

    }
}
