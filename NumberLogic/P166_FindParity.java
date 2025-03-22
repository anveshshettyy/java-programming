package NumberLogic;

import java.util.Scanner;

public class P166_FindParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int count = 0;
        while(n>0) {
            if((n&1) == 1) count++;
            n = n>>1;
        }
        System.out.println((count%2==0) ? "Even Parity" : "Odd Parity");

    }   
}
