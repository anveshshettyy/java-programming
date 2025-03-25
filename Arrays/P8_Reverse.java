package Arrays;

import java.util.Scanner;

public class P8_Reverse {
    static void Reverse(int arr[], int n) {
        for(int i=0; i<n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;

        }
        for(int i=0; i<n; i++) System.out.print(arr[i]+"  ");
    }
    public static void main(String[] args) {
        System.out.print("Enter size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Enter elements of array: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // int left = 0, right = n-1;
        // while(left<right) {
        //     int temp = arr[left];
        //     arr[left] = arr[right];
        //     arr[right] = temp;

        //     left++;
        //     right--;
        // }

        Reverse(arr, n);
    }
}
