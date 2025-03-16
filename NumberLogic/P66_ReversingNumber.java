package NumberLogic;

import java.util.Scanner;

public class P66_ReversingNumber {
    static int Reverse(int n) {
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to reverse: ");
        int n = sc.nextInt();

        int reverse = Reverse(n);
        System.out.println(reverse);
    }
}
