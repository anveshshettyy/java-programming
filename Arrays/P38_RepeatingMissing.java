package Arrays;

import java.util.HashSet;

public class P38_RepeatingMissing {
    static int MissingNumber(int arr[]) {
        int n = arr.length;
        int totalSum = (n* (n+1)) / 2;
        int sum = 0;
        for(int nums:arr)  sum += nums;
        return (totalSum - sum);
    }

    static int RepeatingNumber(int nums[]) {
        int res = 0;

        HashSet<Integer> hs = new HashSet<>();
        for (int i=0; i<nums.length; i++) {
            if (hs.contains(nums[i])) {
                res = nums[i];
                nums[i] = 0;
                break;
            }
            hs.add(nums[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[] = {4, 3, 6, 2, 1, 1};

        System.out.println(RepeatingNumber(nums)+","+MissingNumber(nums));
    }
}
