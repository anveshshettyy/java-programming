package Arrays;

public class P15_CountOccurence {
    static int CountOccurence(int arr[], int k) {
        int n = arr.length, count = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] == k) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = { 3, 6, 2, 9, 7, 2 };
        int k = 2;

        System.out.println("Count of "+k+" is: "+CountOccurence(arr, k));
    }
}
