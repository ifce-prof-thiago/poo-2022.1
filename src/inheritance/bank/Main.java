package inheritance.bank;

public class Main {

    public static void main(String[] args) {

        var account = AccountFactory.create("0090816", 500);

        System.out.println(account.operation());


    }
}
