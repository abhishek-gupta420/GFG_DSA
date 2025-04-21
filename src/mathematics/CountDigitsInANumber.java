package mathematics;

public class CountDigitsInANumber {
    public static void main(String[] args) {
        System.out.println(countDigit(45434));
        System.out.println(countDigit(9));

        System.out.println(countDigit(0));
        System.out.println(countDigit(909788));
        System.out.println(countDigit(-10992));
    }

    public static int countDigit(long n) {
        if (n == 0) return 1;
        if (n < 0) n *= -1;
        System.out.println("N -> " + n);

        int res = 0;

        while (n > 0) {
            n /= 10;
            res++;
        }
        return res;
    }
}