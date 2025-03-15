package NumberLogic;

import java.util.Scanner;

public class P11_Palindrome {
    static void Palindrome(int n) {
        int temp = n, rev = 0;
        while(temp > 0) {
            int rem = temp % 10;
            temp /= 10;
            rev = rev*10 + rem;
        }
        System.out.println((n==rev) ? "It is a Palindrome" : "It is Not a Palindrome");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        Palindrome(n);
    }
}
