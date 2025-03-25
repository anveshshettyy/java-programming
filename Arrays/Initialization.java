package Arrays;

import java.util.Scanner;

public class Initialization {
    public static void main(String[] args) {
        System.out.print("Enter size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Enter elements of array: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // for(int i=0; i<n; i++) {
        //     System.out.print(arr[i]+" ");
        // }

        System.out.println(arr);
    }
}
