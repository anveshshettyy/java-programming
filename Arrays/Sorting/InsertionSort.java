package Arrays.Sorting;

public class InsertionSort {
    static void Insertionsort(int nums[]) {
        int n = 5;
        for(int i=1; i<n; i++) {
            int j = i;
            while(j>0 && nums[j] < nums[j-1]) {
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {7, 5, 4, 1, 3};
        
        Insertionsort(nums);

        for (int i : nums)  System.out.print(i+" ");
        
    }
}
