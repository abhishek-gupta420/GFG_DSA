package mathematics;

public class Gcd_Euclidean_Algo {
    public static void main(String[] args) {
        System.out.println(gcd(4, 6));
        System.out.println(gcd(5, 10));

        System.out.println(gcd(7, 8));
        System.out.println(gcd(23, 529));
        System.out.println(gcd(100, 200));
        System.out.println(gcd(1000000, 2000000));
    }

    public static long gcd(long a, long b) {
        while (a != b) {
            if (a < b) b = b - a;
            else a = a - b;
        }

        return a;
    }

}
