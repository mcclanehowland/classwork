package Box;

public class Account {

    private int pin;
    protected double balance;
    protected String name;
    
    public Account(int pin, double balance, String name) {
        this.pin = pin;
        this.balance = balance;
        this.name = name;
    }
    public String toString() {
        return name+" "+balance;
    }
}
