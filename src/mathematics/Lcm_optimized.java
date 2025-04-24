package mathematics;

public class Lcm_optimized {
    public static void main(String[] args) {
        System.out.println(lcm(4, 6));
        System.out.println(lcm(5, 10));

        System.out.println(lcm(7, 8));
        System.out.println(lcm(23, 529));
        System.out.println(lcm(100, 200));
        System.out.println(lcm(100000000, 200000000));
    }

//    TC = O (log(min(a,b)))
    static long lcm(long a, long b) {

        return a * b / Gcd_Euclied_Algo_Optimized.gcd(a, b);

    }
}
