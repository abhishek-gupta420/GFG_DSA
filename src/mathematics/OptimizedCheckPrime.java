package mathematics;

public class OptimizedCheckPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(523));
        System.out.println(isPrime(100));
        printPrimeNumberUpToN(100000000);
    }

    public static void printPrimeNumberUpToN(int n) {
        System.out.println();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(" " + i);
                if (count % 10 == 0)
                    System.out.println();
                count++;
            }


        }
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
