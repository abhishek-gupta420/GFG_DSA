package mathematics;

public class NthTermInGP {
//    Tn = ar ^ (n-1), formula
//    where 'a' is the first term, 'r' is the common ratio, and 'n' is the term number.

    public static void main(String[] args) {

        System.out.println((int) Math.floor(NthTerm(1,2,5)));
        System.out.println((int) Math.floor(NthTerm(2,3,1)));
        System.out.println((int) Math.floor(NthTerm(84,87,3)));


    }


/*    *//*
     *    formula to calculate nth term in gp
            Tn = A.r^(n-1)
             where A = 1st term
             r = common ration calculate by B/A
     *
     * */
    public static double NthTerm(int a, int b, int n) {


        if (a == 0) {
            throw new IllegalArgumentException("First term (a) cannot be zero.");
        }

        double r = (double) b / a;  // Cast to double for accurate division
        return a * Math.pow(r, n - 1);
//        return res;
    }


}
