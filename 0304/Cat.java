public class Cat extends Animal {
    
    public Cat(String name) {
        super(name);
    }
    public void printInfo() {
        System.out.println(super.getName());
        super.speak();
        this.speak();
    }
    public void speak() {
        System.out.println("meow");
    }
}
