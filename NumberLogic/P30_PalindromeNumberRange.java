package NumberLogic;

import java.util.Scanner;

public class P30_PalindromeNumberRange {
    static int PalindromeNumber(int n) {
        int rev = 0, temp = n;
        while(n>0) {
            int rem = n % 10;
            n /= 10;
            rev = rev * 10 + rem;
        }
        return (rev == temp) ? temp : 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i=0; i<=n; i++) {
            int res = PalindromeNumber(i);
            if(res != 0 ) System.out.print(res+" ");
        }
    }
}
