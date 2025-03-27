package Arrays.Sorting;

public class SelectionSort {
    static void Selectionsort(int nums[]) {
        int n = 5, min = 0;
        for(int i=0; i<n; i++) {
            min = i;
            for(int j=i+1; j<n; j++) {
                if(nums[j] < nums[min]) 
                    min = j;
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }
    public static void main(String[] args) {
        int nums[] = {7, 5, 4, 1, 3};
        
        Selectionsort(nums);

        for (int i : nums)  System.out.print(i+" ");
        
    }
    
}
