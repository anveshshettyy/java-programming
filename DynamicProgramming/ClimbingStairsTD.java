package DynamicProgramming;

import java.util.Arrays;

public class ClimbingStairsTD {
    static int countStairsRec(int n, int memo[]) {
        if(n<=1) return 1;

        if(memo[n] != -1) return memo[n];

        memo[n] = countStairsRec(n-1, memo) + countStairsRec(n-2, memo);

        return memo[n];
    }
    static int countStairs(int n) {
        int memo[] = new int[n+1];
        Arrays.fill(memo, -1);
        return countStairsRec(n, memo);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countStairs(n));
    }
}
