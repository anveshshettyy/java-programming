package Arrays;

public class P42_RemoveDuplicates {
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 2, 3, 3, 4};

        int i=0;
        for(int j=1; j<nums.length; j++) {
            if(nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        for(int j = 0; j <=i; j++) {
            System.out.print(nums[j]+" ");
        }
    }
}
