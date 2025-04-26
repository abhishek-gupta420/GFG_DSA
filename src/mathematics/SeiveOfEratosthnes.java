package mathematics;

import java.util.Arrays;

public class SeiveOfEratosthnes {
    public static void main(String[] args) {

        seive(100);
    }

    public static void seive(int n) {
        Boolean[] arr = new Boolean[n + 1];
        Arrays.fill(arr, Boolean.TRUE);
        System.out.println("Length of arr :-> " + arr.length);
//        Arrays.stream(arr).forEach(System.out::println);
        for (int i = 2; i * i <= n; i++) {
            if (OptimizedCheckPrime.isPrime(i)) {
                for (int  j = 2 * i; j <= n; j = j + i) {
                    arr[j] = Boolean.FALSE;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (arr[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
