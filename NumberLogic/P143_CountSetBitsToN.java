package NumberLogic;

import java.util.Scanner;


public class P143_CountSetBitsToN {
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
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int res = 0;
        for(int i = 1; i<=n; i++) 
            res += CountSetBits(i);
        
        System.out.println("Number of Set bits are: "+res);
    }
}
