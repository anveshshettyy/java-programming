package Arrays;

public class P26_FindPair {
    static void FindPair(int[] nums, int k) {
        int sum = 0, index1 = 0, index2 = 0;
        for(int i=0; i<nums.length-1; i++) {
            sum = nums[i] + nums[i+1];
            if(sum == k) {
                index1 = i;
                index2 = i+1;
            }
        }
        System.out.print(index1+" "+index2);
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8,9,10,2};
        int target = 19;

        FindPair(arr1, target);

    }
}
