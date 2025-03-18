package NumberLogic;

import java.util.Scanner;

public class P133_Multiplication {
    static int Multiply(int a, int b, int res) {
        if( b == 0 ) return res;
        else if (b < 0) {
            res += a;
            b--;
            return -Multiply(a, -b, res);
        }
        else {
            res += a;
            b--;
            return Multiply(a, b, res);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter a number: ");
        int num2 = sc.nextInt();

        int res = 0;
        System.out.println(Multiply(num1, num2, res));
    }
}
