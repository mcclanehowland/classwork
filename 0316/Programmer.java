public class Programmer extends Profile {
    public Programmer() {
        super("ABC Inc.");
    }
    public String getInfo() {
        return "programmer 25 years old, works at "+getEmployer();
    }
}
    
