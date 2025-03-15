package NumberLogic;

import java.util.Scanner;

public class P5_ReverseNumber {
    static int ReverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;;
            n /= 10;
            rev = rev * 10 + rem;
        }
        return rev;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Reverse is: "+ReverseNumber(n));
    }
}
