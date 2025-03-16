package NumberLogic;

import java.util.Scanner;

public class P48_NthPalindrome {
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
        
        System.out.print("Enter x: ");
        int x = sc.nextInt();

        int i = 0, res = 0;
        while(x > 0) {
            res = PalindromeNumber(i);
            if(res != 0) x--;
            i++;
        }
        
        System.out.println(res);
    }
}
