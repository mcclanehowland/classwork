public class test{

	public static void main(String[] args){
        thing t = new thing();
        long num = 600851475143L;
        System.out.println(t.isPrime(3));
        for(long i = num-1; i > 1;i--) {
            if(num%i == 0 && t.isPrime(i)) {

                System.out.print(i); 
                break;
            }
        }
    }
}
            










