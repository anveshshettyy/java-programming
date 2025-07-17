package DynamicProgramming;

import java.util.Arrays;

public class CountWaysTD {
    public static int countWay(int n, int[] memo) {
        if(n < 0) return 0;
        if(n == 0) return 1;

        if(memo[n] != -1) return memo[n];

        memo[n] = countWay(n-1, memo) + countWay(n-3, memo) + countWay(n-5, memo);
        return memo[n];
    }
    public static void main(String[] args) {
        int n = 7;
        int memo[] = new int[n+1];
        Arrays.fill(memo, -1);
        System.out.println(countWay(n, memo));
        for(int i:memo) {
            System.out.print(i+" ");
        }
    }
}
