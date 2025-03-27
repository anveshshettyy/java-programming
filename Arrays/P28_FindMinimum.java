package Arrays;

public class P28_FindMinimum {
    public static void main(String[] args) {
        int nums[] = {5,1,2,3,4};
        int n = nums.length;

        int min = Integer.MAX_VALUE;
        int left = 0, right = n-1;
        while(left<=right) {
            int mid = (left + right) / 2;
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                min = nums[mid];
                break;
            }
            if (mid < n - 1 && nums[mid] > nums[mid + 1]) {
                min = nums[mid + 1];
                break;
            }
            if(nums[left] <= nums[right]) 
                left = mid+1;
            else 
                right = mid-1;
        }
        System.out.println(min);
    }
}
