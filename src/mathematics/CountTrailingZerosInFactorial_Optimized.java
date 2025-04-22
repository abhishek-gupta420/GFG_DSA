package mathematics;

public class CountTrailingZerosInFactorial_Optimized {
    public static void main(String[] args) {

        System.out.println("Trailing zeros in factorial of 5 = " + countTrailingZerosInFactorial(5));

        System.out.println("Trailing zeros in factorial of 6 = " + countTrailingZerosInFactorial(6));
        System.out.println("Trailing zeros in factorial of 10 = " + countTrailingZerosInFactorial(10));
        System.out.println("Trailing zeros in factorial of 20 = " + countTrailingZerosInFactorial(20));

        System.out.println("Trailing zeros in factorial of 100 = " + countTrailingZerosInFactorial(100));

    }

    public static int countTrailingZerosInFactorial(int n) {
//        long fact = Factorial_Iterative.factorial(n);

        int count = 0;
        for (int i = 5; i <= n; i = i * 5) {
            count = count + n / i;
        }
        return count;
    }
}
