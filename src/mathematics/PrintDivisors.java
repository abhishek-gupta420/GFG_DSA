package mathematics;

public class PrintDivisors {
    public static void main(String[] args) {

        printDivisiors(100);
        System.out.println();
        printDivisiors(15);
        System.out.println();
        printDivisiors(16);
        System.out.println();
        printDivisiors(529);
    }

    public static void printDivisiors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
    }
}
