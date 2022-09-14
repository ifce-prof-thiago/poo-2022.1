package inheritance.bank;

public class SavingsAccount extends Account {

    public SavingsAccount(String number) {
        super(number);
    }

    @Override
    void validate() {
        if(balance() < 0) {
            throw new RuntimeException("'balance' can't be negative");
        }
    }

    @Override
    public String operation() {
        return  "013";
    }

}
