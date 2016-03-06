public class thing {
    public boolean isPrime(long num) {
        for(long i = num-1; i > 1; i--) {
            if(num%i == 0)
                return false;
        }
        return true;
    }
}
