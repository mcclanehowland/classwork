public class MedicalStudent extends Student {
    public MedicalStudent(String name) {
        super(name);
    }
    public String saying() {
        return super.saying()+" I study medicine";
    }
}
