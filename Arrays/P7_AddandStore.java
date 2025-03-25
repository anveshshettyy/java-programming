package Arrays;

import java.util.Scanner;

public class P7_AddandStore {
    static int SumofDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;;
            n /= 10;
            sum += rem;
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

        for(int i=0; i<n; i++) {
            int sum = SumofDigits(arr[i]);
            arr[i] = sum;
            System.out.print(arr[i]+" ");
        }
    }
}
