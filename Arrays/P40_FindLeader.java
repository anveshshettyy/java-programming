package Arrays;

public class P40_FindLeader {
    static int LargerElement(int[] nums, int start, int end) {
        int max = 0, index = 0;
        for(int i=start; i<end; i++) {
            if(max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int nums[] = {16, 17, 4, 3, 5, 2};

        int start = 0;
        int end = nums.length;
        

        while(start < end) {
            int res= LargerElement(nums, start, end);
            System.out.print(nums[res]+" ");
            start = res+1;
        }
    }
}
