package Arrays;

import java.util.Scanner;

public class EvenAndOddCount {
    public static void main(String[] args) {
        System.out.print("Enter size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Enter elements of array: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int oddCount = 0, evenCount = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] % 2 == 0) evenCount++;
            else oddCount++;
        }

        System.out.println("Odd Count: "+oddCount);
        System.out.println("EvenCount: "+evenCount);
    }
}
