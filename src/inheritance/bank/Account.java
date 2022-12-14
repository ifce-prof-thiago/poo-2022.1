package inheritance.bank;

public abstract class Account {

    private String number;
    private double balance;

    protected Account(String number) {
        this.number = number;
        this.balance = 0;
    }

    public void deposit(double value) {
        this.balance += value;
        this.validate();
    }

    public void withdraw(double value) {
        this.balance -= value;
        this.validate();
    }

    public static void transfer(Account from, Account to, double value) {
        from.withdraw(value);
        to.deposit(value);
    }

    abstract void validate();

    public String number() {
        return this.number;
    }

    public double balance() {
        return this.balance;
    }

    public abstract String operation();

}
