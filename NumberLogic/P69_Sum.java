package NumberLogic;

import java.util.Scanner;

public class P69_Sum {
    static int Sum(int a, int b) {
        while(b!=0) {
            int carry = a & b;
            a = a ^ b;
            b = carry<<1;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println(Sum(a,b)); 
    }
}
