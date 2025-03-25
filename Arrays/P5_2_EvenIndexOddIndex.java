package Arrays;

import java.util.Scanner;

public class P5_2_EvenIndexOddIndex {
    static void EvenIndexOddIndex(int arr[], int n) {
        System.out.print("Even Index Elements: ");
        for(int i=0; i<n; i++) {
            if(i % 2 == 0) System.err.print(+arr[i]+" ");
        }

        System.out.println();

        System.out.print("Odd Index Elements: ");
        for(int i=0; i<n; i++) {
            if(i % 2 != 0) System.err.print(+arr[i]+" ");
        }
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

        EvenIndexOddIndex(arr, n);

    }
}
