package mathematics;

public class PrintPrimeFactorsOptimized {
    public static void main(String[] args) {
        prinPrimeFactors(12);
        System.out.println();
        prinPrimeFactors(84);
        System.out.println();
        prinPrimeFactors(450);
        System.out.println();
        prinPrimeFactors(13);
        System.out.println();
        prinPrimeFactors(100);

    }

    public static void prinPrimeFactors(int n) {
        if (n == 1) return;

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

//        edge case eg. 84
        if (n > 1) {
            System.out.print(n + " ");
        }
    }
}
