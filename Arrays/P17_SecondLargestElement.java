package Arrays;

public class P17_SecondLargestElement {
    static int SecondLargest(int nums[]) {
        int n = nums.length;
        int fmax = nums[0], smax=0;
        for(int i=0; i<n; i++) {
            if(nums[i] == fmax) continue;
            if(nums[i] > fmax) {
                int temp = fmax;
                fmax= nums[i];
                smax = temp;
            } 
            else if(smax <fmax && nums[i] > smax) {
                smax = nums[i];
            }
        }
        return smax;
    }
    public static void main(String[] args) {
        int[] arr = { 3, 6, 2, 9, 8, 2 };
        
        System.out.println(SecondLargest(arr));
    }
}
