package Arrays;

public class P30_SeperateEvenOdd {
    static void SeperateEvenOdd_(int arr[], int n) {
        int start = 0, end = n - 1;

        while (start < end) {
            if (arr[start] % 2 != 0 && arr[end] % 2 == 0) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            } 
            else if (arr[start] % 2 == 0)  start++;
            else end--;
        }
        for (int i = 0; i < n; i++)  System.out.print(arr[i] + "  ");
    }

    public static void main(String[] args) {

        int n = 6;
        int[] arr = { 3, 6, 2, 9, 7, 4 };

        SeperateEvenOdd_(arr, n);
    }
}
