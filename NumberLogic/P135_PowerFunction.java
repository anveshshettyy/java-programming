package NumberLogic;

import java.util.Scanner;

public class P135_PowerFunction {
    static int Multiply(int a, int b, int res) {
        if( b == 0 ) return res;
        else {
            res += a;
            b--;
            return Multiply(a, b, res);
        }
    }

    static int pow(int n, int x, int temp) {
        int res = 0;
        if (x != 1) {
            res = Multiply(n, temp, x);
            x--;
            return pow(n, x, temp);
        } else {
            return n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter Power: ");
        int x = sc.nextInt();

        int temp = n;
        int res = pow(n,x, temp);
        System.out.println(res);
    }
}
