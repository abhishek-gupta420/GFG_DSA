package mathematics;

public class TrailingZerosInFactorial {
    public static void main(String[] args) {

        System.out.println("Trailing zeros in factorial of 5 = " + countTrailingZerosInFactorial(5));

        System.out.println("Trailing zeros in factorial of 6 = " + countTrailingZerosInFactorial(6));
        System.out.println("Trailing zeros in factorial of 10 = " + countTrailingZerosInFactorial(10));
        System.out.println("Trailing zeros in factorial of 100 = " + countTrailingZerosInFactorial(100));

    }

    public static int countTrailingZerosInFactorial(int n) {
        long fact = Factorial_Iterative.factorial(n);
        System.out.println("Factorial of n -> " + n + " = " + fact);

        int count = 0;
        while (fact % 10 == 0) {
            count++;
            fact /= 10;
        }
        return count;
    }

//    720
//    720 % 10 -> 0 count++;
//    720 / 10 -> 72
//    72 % 10 -> 2 we stop here
}
