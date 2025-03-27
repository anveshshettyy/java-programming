package Arrays;

public class P18_SecondSmallest {
    static int SecondMinimum(int nums[]) {
        int n = nums.length;
        int fmin = nums[0], smin=9999;
        for(int i=0; i<n; i++) {
            if(nums[i] == fmin) continue;
            if(nums[i] < fmin) {
                int temp = fmin;
                fmin= nums[i];
                smin = temp;
            } 
            else if(smin > fmin && nums[i] < smin) {
                smin = nums[i];
            }
        }
        return smin;
    }
    public static void main(String[] args) {
        int[] arr = { 3, 6, 2, 9, 8, 2 };
        
        System.out.println(SecondMinimum(arr));
    }
}
