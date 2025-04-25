package mathematics;

public class OptimizedCheckPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(523));
        System.out.println(isPrime(100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;
        if (n == 2  || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }

        return true;
    }
}
