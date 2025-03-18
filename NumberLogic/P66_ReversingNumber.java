package NumberLogic;

import java.util.Scanner;

public class P66_ReversingNumber {
    static int Reverse(int n, int res) {
        if(n==0) return res;
        int rem = n%10;
        return Reverse(n/10, res*10 + rem);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to reverse: ");
        int n = sc.nextInt();

        System.out.println(Reverse(n,0));
    }
}
