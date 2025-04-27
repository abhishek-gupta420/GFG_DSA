package mathematics;

public class PowerIterativeExponentiation {
    public static void main(String[] args) {

        System.out.println(pow(4, 5));
    }

    public static int pow (int x, int n) {

        int res = 1;
        while (n > 0) {
            if (n % 2 != 0) {
                res = res * x;
            }

            x = x * x;
            n = n / 2;
        }

        return res;
    }
}
