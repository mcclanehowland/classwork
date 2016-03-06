public class Dog extends Animal {
    
    public Dog(String name) {
        super(name);
    }
    public void printInfo() {
        System.out.println(super.getName());
        super.speak();
        this.speak();
    }
    public void speak() {
        System.out.println("woof");
    }
}

