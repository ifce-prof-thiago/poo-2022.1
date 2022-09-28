package inheritance.bank;

public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(String number, double overdraftLimit) {
        super(number);
        this.overdraftLimit = overdraftLimit;

    }

    @Override
    public String operation() {
        return "001";
    }

    @Override
    public void validate() {
        if(overdraftLimit + balance() < 0) {
            throw new RuntimeException("'balance' can't be negative");
        }
    }


}
