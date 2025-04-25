package mathematics;

public class CheckPrimeOptimizedSqrt {
    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(523));
        System.out.println(isPrime(100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
//            we can also write above  condition as i * i <= n
            if (n % i == 0) return false;
        }
        return true;
    }
}
