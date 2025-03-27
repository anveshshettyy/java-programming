package Arrays;

public class P29_FindMaximumOf2 {
    static int FindMaximum(int nums[]) {
        int max = 0;
        for(int i=1; i<nums.length; i++) {
            int product = nums[i-1] * nums[i];
            if(product > max) max = product;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,-10};

        int max = FindMaximum(arr);
        System.out.println(max);
    }
}
