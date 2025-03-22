package NumberLogic;

import java.util.Scanner;

public class P161_ReverseBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int rev = 0;
        while(n>0) {
            rev = rev<<1;
            if((n&1) == 1) rev = rev^1;
            n = n>>1;
        }

        System.out.println(rev);
    }
    
    
}
