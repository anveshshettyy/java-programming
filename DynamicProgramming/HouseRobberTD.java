package DynamicProgramming;

import java.util.Arrays;

public class HouseRobberTD {
    static int MaxLoot(int memo[], int nums[], int n) {
        if(n<=0) return 0;
        if(n==1) return nums[0];

        if(memo[n] != -1) return memo[n];

        int picked = nums[n-1] + MaxLoot(memo, nums, n-2);
        int notpicked = MaxLoot(memo, nums, n-1);

        return Math.max(picked, notpicked);

    }
    static int MaxLootArray(int nums[], int n) {
        int memo[] = new int[n+1];
        Arrays.fill(memo, -1);
        return MaxLoot(memo, nums, n);
    }
    public static void main(String[] args) {
        int arr[] = {6, 7, 1, 3, 8, 2, 4};
        System.out.println(MaxLootArray(arr, arr.length));
    }
}
