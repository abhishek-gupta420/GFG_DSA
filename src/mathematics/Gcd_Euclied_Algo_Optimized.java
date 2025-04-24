package mathematics;

public class Gcd_Euclied_Algo_Optimized {
    public static void main(String[] args) {
        System.out.println(gcd(4, 6));
        System.out.println(gcd(5, 10));

        System.out.println(gcd(7, 8));
        System.out.println(gcd(23, 529));
        System.out.println(gcd(100, 200));
        System.out.println(gcd(100000000, 200000000));
    }

    static long gcd(long a, long b) {
        if (b == 0) return a;

        return gcd(b, a % b);
    }
}
