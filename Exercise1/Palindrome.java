package Exercise1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int rem = 0, rev = 0, temp = num;
        while( num > 0 ) {
            rem = num % 10;
            num = num / 10;
            rev = rev * 10 + rem;
        }
        System.out.println((temp == rev) ? "It is a Palindrome" : "It is not a Paldinrome");
    }
}
