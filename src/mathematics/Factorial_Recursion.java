package mathematics;

public class Factorial_Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(4));
        System.out.println(factorial(6));
    }

    public static int factorial (int n) {
        if (n == 0) return 1;

        return n * factorial(n - 1);
    }
}
