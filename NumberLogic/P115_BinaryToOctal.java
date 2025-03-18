package NumberLogic;

import java.util.Scanner;

public class P115_BinaryToOctal {
    static int Binrary2Decimal(int n) {
        int res = 0, mul = 1;
        while(n>0) {
            int rem = n%2;
            res += rem * mul;
            n /= 10;
            mul *=2;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        int decimal = Binrary2Decimal(n);

        int res = 0, mul = 1;
        while(decimal > 0) {
            int rem = decimal%8;
            res += rem * mul;
            decimal /= 8;
            mul *= 10;
        }
        System.out.println(res);
    }
}
