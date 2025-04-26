package mathematics;

public class PrimeFactors {
    public static void main(String[] args) {

        primeFactors(12);
    }

    public static void primeFactors(int n) {
        for (int i = 2; i < n; i++) {
            if (OptimizedCheckPrime.isPrime(i)) {
                int x = i;
                while (n % x == 0) {
                    System.out.print(" " + i);
                    x = x * i;
                }
            }
        }
    }
}
