package NumberLogic;

import java.util.Scanner;

public class P148_CountSetBitsInArray {
    static int CountSetBits(int n) {
        int count = 0;
        while(n>0) {
            if((n&1)==1) count++;
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter array Elements: ");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        int res = 0;
        for(int i = 0; i<size; i++) 
            res += CountSetBits(arr[i]);
        
        System.out.println("Number of Set bits are: "+res);
    }
}
