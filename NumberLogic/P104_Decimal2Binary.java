package NumberLogic;

import java.util.Scanner;

public class P104_Decimal2Binary {
    static int Decimal2Binary(int n, int res, int pow) {
            int rem = n%2;
            res += (rem*pow);
            return (n==0) ? res : Decimal2Binary(n/2, res, pow*10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();

        int res = 0, pow = 1;
        int decimal = Decimal2Binary(n, res, pow);
        System.out.println(decimal);
    }
}
