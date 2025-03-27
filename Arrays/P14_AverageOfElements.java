package Arrays;

public class P14_AverageOfElements {
    static int Average(int arr[], int n) {
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += arr[i];
        }
        return sum / n;
    }
    public static void main(String[] args) {
        int n = 6;
        int[] arr = { 3, 6, 2, 9, 7, 4 };

        System.out.println("Average is: "+Average(arr, n));
    }
}
