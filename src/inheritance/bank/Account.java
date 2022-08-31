package inheritance.bank;

public class Account {

    private String number;
    private double balance;

    protected Account(String number) {
        this.number = number;
        this.balance = 0;
    }

    public String number() {
        return this.number;
    }

    public double balance() {
        return this.balance;
    }

}
