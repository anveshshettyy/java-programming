package Arrays;

import java.util.Scanner;

public class BinarySearch {
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

        int index = 0;
        int left = 0, right = n-1;
        while(left<right) {
            int mid = (right+left) / 2;

            if(arr[mid] == k) {
                index = mid;
                break;
            }

            if(arr[mid] < k) {
                left = mid;
                mid++;
            } else {
                right = mid;
                mid--;
            }
            
        }

        System.out.println(index);
    }
}
