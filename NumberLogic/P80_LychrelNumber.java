package NumberLogic;

import java.util.Scanner;

public class P80_LychrelNumber {
    static long reverseNumber(long n) {
        long rev = 0;
        while (n > 0) {
            long rem = n % 10;
            n /= 10;
            rev = rev * 10 + rem;
        }
        return rev;
    }
    static long isPalindrome(long n) {
        long rev = 0, temp = n;
        while (n > 0) {
            long rem = n % 10;
            n /= 10;
            rev = rev * 10 + rem;
        }
        return (temp == rev) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        long n = sc.nextInt();
        
        long flag = 0;
        for(long i=0; i<20; i++) {
            n = n + reverseNumber(n);
            if(isPalindrome(n) == 1) {
                flag++;
                break;
            }
        }

        System.out.println((flag == 0) ? "It is a Lychrel Number" : "It is not a Lychrel Number");
    }
}
 