package mathematics;

public class DigitsInFactorial {
    public static void main(String[] args) {
        System.out.println(countDigitsInFactorial(42));
    }

    public static int countDigitsInFactorial(long n) {

        double res = 0;

        for (int i = 1; i <= n; i++) {
            res = res + Math.log10(i);
        }
        return (int) Math.floor(res) + 1;
    }
}
