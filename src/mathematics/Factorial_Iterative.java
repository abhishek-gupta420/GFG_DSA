package mathematics;

public class Factorial_Iterative {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(4));
        System.out.println(factorial(6));

    }

    public static long factorial (long n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
