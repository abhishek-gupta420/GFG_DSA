package mathematics;

public class PrimeFactorsEfficientSolution {
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
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n  /= 2;
        }
        while (n % 3 == 0) {
            System.out.print(3 + " ");
            n /= 3;
        }
        for (int i = 5; i * i <= n; i += 6) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
            while (n % (i + 2) == 0) {
                System.out.print(i + 2 + " ");
                n /= (i + 2);
            }
        }

//        edge case eg. 84
        if (n > 3) {
            System.out.print(n + " ");
        }
    }
}
