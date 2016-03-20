public abstract class Car {
    private String companyName;
    public Car(String companyName) {
        this.companyName = companyName;
    }
    public abstract String getInfo();
    public String getName() {
        return companyName;
    }
}
