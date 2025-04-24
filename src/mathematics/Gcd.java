package mathematics;

public class Gcd {
    public static void main(String[] args) {
        System.out.println(gcd(4, 6));
        System.out.println(gcd(5, 10));

        System.out.println(gcd(7, 8));
        System.out.println(gcd(23, 529));
        System.out.println(gcd(100, 200));

    }
// TC = O (min (a,b))
    public static int gcd (int a, int b) {

//        int startPoint = a < b ? a : b;
        int startPoint = Math.min(a, b);
        while (startPoint > 1) {

            if (a % startPoint == 0 && b % startPoint == 0)
                return startPoint;
            startPoint--;
        }
        return 1;
    }
}
