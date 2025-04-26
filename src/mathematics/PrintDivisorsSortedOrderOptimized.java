package mathematics;

public class PrintDivisorsSortedOrderOptimized {
    public static void main(String[] args) {
        printDivisiors(100);
        System.out.println();
        printDivisiors(15);
        System.out.println();
        printDivisiors(16);
        System.out.println();
        printDivisiors(529);
    }

    private static void printDivisiors(int n) {
        int i;
        for (i = 1; i * i < n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

        for (; i >= 1; i--) {
            if (n % i == 0) {
                System.out.print(n / i + " ");
            }
        }
    }
}
