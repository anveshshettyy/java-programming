package Exercise3;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        // for(int i=0; i<n; i++) {
        //     arr[i] = i+1;
        // }

        for(int i=0; i<n; i++) {
            arr[i] = n-i;
        }

        for(int i:arr) System.out.print(i+" ");
    }
}
