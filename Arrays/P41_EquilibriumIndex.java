package Arrays;

public class P41_EquilibriumIndex {
    static int mid(int[] nums, int end) {
        int sum1 = 0, sum2 = 0;
        for(int i=0; i<end; i++) {
            sum1 += nums[i];
        }
        for(int i=end+1; i<nums.length; i++) {
            sum2 += nums[i];
        }
        return (sum1 == sum2) ? end : -1;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        for(int i=0; i<nums.length; i++) {
            int res = mid(nums, i);
            if(res != -1) {
                System.out.println(i);
            }
        }   
    }
}
