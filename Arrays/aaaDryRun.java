package Arrays;

import java.util.Scanner;

public class aaaDryRun {
    public static void main(String[] args) {
        int nums[] = {6,9,4,8,2,1};
        int n = nums.length;
        // int target = 6;

        for(int i=1; i<n; i++) {
            int j = i;
            while(j>0 && nums[j-1]> nums[j]) {
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
                j--;
            }
        }

        for(int i:nums) {
            System.out.print(i+" ");
        }

    }
}
