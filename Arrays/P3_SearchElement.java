package Arrays;

import java.util.Scanner;

public class P3_SearchElement {
    static int LinearSearch(int arr[], int n, int k) {
        int index = 0;
        for(int i=0; i<n; i++) {
            if(arr[i]==k) index = i;
        }
        return index;
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

        System.out.print("Enter element to search: ");
        int k = sc.nextInt();

        int index = LinearSearch(arr, n, k);

        System.out.println(index);
    }
}
