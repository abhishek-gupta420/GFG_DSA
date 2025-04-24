package mathematics;

public class Lcm {
    public static void main(String[] args) {
        System.out.println(lcm(4, 6));
        System.out.println(lcm(5, 10));

        System.out.println(lcm(7, 8));
        System.out.println(lcm(23, 529));
        System.out.println(lcm(100, 200));
        System.out.println(lcm(100000000, 200000000));
    }

//    TC = O(a * b - Max(a,b));
    static int lcm  (int a, int b) {
        int startPoint = Math.max(a, b);

        while (startPoint <= a * b) {
            if (startPoint % a == 0 && startPoint % b == 0) return startPoint;
            startPoint++;
        }

        return startPoint;

    }
}
