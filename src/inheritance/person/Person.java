package inheritance.person;

public class Person {

    private String name;
    private String CPF;

    public Person() {
        System.out.println("B");
    }

    private void validate() {

        if (this.name == null || this.name.isEmpty()) {
            throw new IllegalArgumentException("Name is required");
        }

        if (this.CPF == null || this.CPF.isEmpty()) {
            throw new IllegalArgumentException("CPF is required");
        }

    }

    public void update(String name, String CPF) {
        this.name = name;
        this.CPF = CPF;

        this.validate();
    }

    public String name() {
        return this.name;
    }

    public String CPF() {
        return this.CPF;
    }

}
