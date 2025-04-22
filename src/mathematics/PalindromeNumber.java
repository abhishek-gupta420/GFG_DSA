package mathematics;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(5));
        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome(112233));
        System.out.println(isPalindrome(1010101));
        System.out.println(isPalindrome(999888));
    }

    public static Boolean isPalindrome(int n) {
        int tmp = n;
        int rev = 0;
        if (n >= 0 && n < 10) return true;

        while (tmp > 0) {
            int lastDigit = tmp % 10;
            tmp /= 10;
            rev = rev * 10 + lastDigit;
        }
        System.out.println("Result variable : " + rev + " n = " + n);

        return n == rev;
//        tmp -> 505 ->
//        loopp chalayenge jo ki last se digits alg kr k res variable me dalega n > 0
//        res = 5 -> 50 -> 505
//        lst me n or res ko comapre krenge if they are equal return true else false.


    }

}
