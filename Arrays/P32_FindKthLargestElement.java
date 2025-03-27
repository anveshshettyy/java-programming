package Arrays;

import java.util.Arrays;

public class P32_FindKthLargestElement {
    public static void main(String[] args) {
        int nums[] = {5,3,4,6,7,3,2};
        int n = nums.length;
        int k = 6;

        // int max = 0, maxIndex = 0;
        // for(int j=0; j<k; j++) {
        //     max = 0;
        //     for(int i=0; i<n; i++) {
        //         if(nums[i] > max) {
        //             max = nums[i];
        //             maxIndex = i;
        //         }
        //     }
        //     nums[maxIndex] = 0;
        // }

        Arrays.sort(nums);

        int max = nums[n-k];

        System.out.println(max);
    }
}
