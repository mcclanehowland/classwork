public class Runner {
    public static void main(String[] args) {
        PublicPrivateTest p = new PublicPrivateTest();
        System.out.println(p.num1);
        //System.out.println(p.num2);
        //System.out.println(p.word1);
        System.out.println(p.word2);
        p.testMethod1();
        System.out.println(p.testMethod2("hello","thing"));
        //System.out.println(p.testMethod3());
        System.out.println(p.testMethod4());
        //p.testMethod5();
    }
}
