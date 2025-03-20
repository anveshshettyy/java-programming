package NumberLogic;

import java.util.Scanner;

public class P145_AddTwoNums {
    static int Sum(int a, int b) {
        int carry = 0;
        while(b>0) {
            carry = a & b;
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

        int res = Sum(a,b);
        System.out.println(res);
    }
}
