package mathematics;

public class PowerEfficient {
    public static void main(String[] args) {

        System.out.println(pow(2, 3));
        System.out.println(pow(5,2));
        System.out.println(pow1(2, 8));
        System.out.println(pow1(4, 2));
    }

    public static int pow(int x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n % 2 == 0) {
           return pow(x, n / 2) * pow(x, n / 2);
        } else {
           return pow(x, n - 1) * x;
        }
    }

    public static int pow1(int x, int n) {
        if (n == 0) return 1;

        int temp = pow1 (x, n / 2);
        temp *= temp;
        if (n % 2 == 0) return temp;
        else return temp * x;
    }
}
