package Arrays;

import java.util.Scanner;

public class ProductOfArray {
    public static void main(String[] args) {
        System.out.print("Enter size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Enter elements of array: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int product = 1;
        for(int i=0; i<n; i++) {
            product *= arr[i];
        }

        System.out.println(product);
    }
}
