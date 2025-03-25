package Arrays;

import java.util.Scanner;

public class P1_SumOfArray {
    static int Sum(int arr[],int n) {
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += arr[i];
        }
        return sum;
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

        int sum = Sum(arr, n);

        System.out.println(sum);
    }
}
