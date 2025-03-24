package NumberLogic;

import java.util.Scanner;

public class P157_NonRepeatingElem {
    static void CheckNonRepeatingElements(int arr[], int n) {
        int[] hash = new int[1000];

        for(int i=0; i<n; i++) {
            hash[arr[i]] = (hash[arr[i]] == 0) ? 1 : -1;
        }

        for(int i=0; i<n; i++) {
            if(hash[arr[i]] == 1)  System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter Array elements: ");
        for(int i=0; i<n;i++) {
            arr[i] = sc.nextInt();
        }

        CheckNonRepeatingElements(arr, n);
    }
}
