package NumberLogic;

import java.util.Scanner;

public class P159_Overflow {
    static int Sum(int a, int b) {
        int sum = a+b;
        if(((a>0)&&(b>0)&&(sum<0)) || ((a<0)&&(b<0)&&(sum>0)) ) return -1;
        return sum;
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
