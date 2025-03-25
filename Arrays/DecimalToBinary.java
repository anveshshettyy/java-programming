package Arrays;

import java.util.Scanner;

public class DecimalToBinary {
    static int DecimalToBinary(int n) {
        int res = 0, pow = 1;
        while (n > 0) {
            int rem = n % 2;
            res += (rem * pow); 
            n /= 2;
            pow *= 10;
        }
        return res;
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

        for(int i=0; i<n; i++) {
            int binary = DecimalToBinary(arr[i]);
            arr[i] = binary;
        }

        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
