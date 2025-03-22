package NumberLogic;

import java.util.Scanner;

public class P158_NumberOccuringOddTimes {
    static void NumberOccuringOddTimes(int arr[], int n) {
        int[] hash = new int[1000];

        for(int i=0; i<n; i++) {
            hash[arr[i]]++;
        }

        for(int i=0; i<n; i++) {
            if(hash[arr[i]] % 2 != 0) {
                System.out.println(arr[i]);
                hash[arr[i]] = 2;
            }
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

        NumberOccuringOddTimes(arr, n);
    }
}
