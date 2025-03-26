package Arrays;

public class P11_Twopointer {
    static void TwoPointer(int arr[], int n) {
        int start = 0, end = n - 1;
        // int start = 0, end = n / 2;
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

        // while(start < end && end <n-1) {
        //     if (arr[start] % 2 != 0 && arr[end] % 2 == 0) {
        //         int temp = arr[start];
        //         arr[start] = arr[end];
        //         arr[end] = temp;
        //         start++;
        //         end++;
        //     } 
        //     else if(arr[start] %2 == 0) start++;
        //     else if(arr[end] %2 != 0) end++;
        // }

        for (int i = 0; i < n; i++)  System.out.print(arr[i] + "  ");
    }

    public static void main(String[] args) {

        int n = 6;
        int[] arr = { 3, 6, 2, 9, 7, 4 };

        TwoPointer(arr, n);
    }
}
