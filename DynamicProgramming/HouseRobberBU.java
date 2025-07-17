package DynamicProgramming;

public class HouseRobberBU {
    static int MaxLootArray(int arr[], int n) {
        int dp[] = new int[n+1];

        dp[0] = 0;
        dp[1] = arr[0];
        
        for(int i=2; i<=n; i++) {
            dp[i] = Math.max((arr[i-1] + dp[i-2]), dp[i-1]);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int arr[] = {6, 7, 1, 3, 8, 2, 4};
        System.out.println(MaxLootArray(arr, arr.length));
    }
}
