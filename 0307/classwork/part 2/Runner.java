public class Runner {
    public static void main(String[] args) {
        BigDog d1 = new BigDog("Bone");
        System.out.println(d1.speak());
        Dog d2 = (Dog)d1;
        System.out.println(d2.speak());
    }
}

