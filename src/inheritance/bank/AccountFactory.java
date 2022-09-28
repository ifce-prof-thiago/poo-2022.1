package inheritance.bank;

public class AccountFactory {

    public static Account create(String number) {
        return new SavingsAccount(number);
    }

    public static Account create(String number, double limit) {
        return new CurrentAccount(number, limit);
    }

    public static void s(int a, int b) {
        System.out.println("int, int");
    }

    public static void s(int a, String b) {
        System.out.println("int, String");
    }

}
