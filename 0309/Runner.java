public class Runner {
    public static void main(String[] args) {
        ComputerScienceStudent c = new ComputerScienceStudent("Jack");
        System.out.println(c.saying());
        Student s = c;
        System.out.println(s.saying());
    }
}
