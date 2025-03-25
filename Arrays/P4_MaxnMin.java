package Arrays;

import java.util.Scanner;

public class P4_MaxnMin {
    static void MaxnMin(int arr[], int n) {
        int max = arr[0], min = arr[0];
        for(int i=0; i<n; i++) {
            if(arr[i] <= min) min = arr[i];
            if(arr[i] >= max) max = arr[i];
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
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

        MaxnMin(arr, n);
    }
}
