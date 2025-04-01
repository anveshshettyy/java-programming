package Arrays;

import java.util.ArrayList;

public class P37_SubarraywithGivenSum {
    public static void main(String[] args) {
        int nums[] = {1, 10, 4, 0, 3, 5};
        int target = 7;

        int i1=-1, i2 = -1, sum = 0;
        int left = 0, right = 0;
        while(right < nums.length) {
            sum += nums[right];
            right++;

            while(sum > target && left<right) {
                sum -= nums[left];
                left++;
            }
            
            if(sum == target) {
                i1 = left+1; 
                i2 = right;
                break;
            }
        }

        System.out.print(i1+"  "+i2);
    }
}
