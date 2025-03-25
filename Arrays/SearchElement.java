package Arrays;

import java.util.Scanner;

public class SearchElement {
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
        for(int i=0; i<n; i++) {
            if(arr[i]==k) index = i;
        }

        System.out.println(index);
    }
}
