package DynamicProgramming;

public class HouseRobber {
    static int MaxLoot(int arr[], int n) {
        if(n==0) return 0;
        if(n==1) return arr[0];

        //pick and not-pick
        int pick = arr[n-1] + MaxLoot(arr, n-2);
        int notpick = MaxLoot(arr, n-1);

        return Math.max(pick, notpick);
    }
    public static void main(String[] args) {
        int arr[] = {6, 7, 1, 3, 8, 2, 4};
        System.out.println(MaxLoot(arr, arr.length));
    }
}
