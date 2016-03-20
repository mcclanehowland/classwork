public abstract class Profile {
    private String employerName;
    public Profile(String name) {
        employerName = name;
    }
    public abstract String getInfo(); 
    public String getEmployer() {
        return employerName;
    }
}

