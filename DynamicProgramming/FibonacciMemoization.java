package DynamicProgramming;
import java.util.*;

public class FibonacciMemoization {
    static int fibRc(int n, int[] memo) {
        if(n <= 1) return n;

        if(memo[n] != -1) return memo[n];

        memo[n] = fibRc(n-1, memo) + fibRc(n-2, memo);
        for(int i:memo) {
            System.out.print(i+" ");
        }
        System.out.println();

        return memo[n];
    }
    static int fib(int n) {
        int memo[] = new int[n+1];
        Arrays.fill(memo, -1);
        for(int i:memo) {
            System.out.print(i+" ");
        }
        System.out.println();

        return fibRc(n, memo);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
}
