package mathematics;

public class Power {
    public static void main(String[] args) {
        System.out.println(pow(2,3));
        System.out.println(pow(5,2));

    }

    public static int pow(int x, int n) {
//        if (n == 0) return 1;
//        if (n == 1) return x;
        int pow = 1;
        for (int i = 1; i <= n; i++) {
            pow = pow * x;
        }
        return pow;
    }
}
