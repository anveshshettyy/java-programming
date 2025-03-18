package NumberLogic;

import java.util.Scanner;

public class P116_OctalToBinary {
    static int OctalToDecimal(int n) {
        int res = 0, pow = 1;
        while(n>0) {
            int rem = n%10;
            res += (rem * pow);
            pow *= 8;
            n /= 10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int decimal = OctalToDecimal(n);

        int res = 0, pow = 1;
        while(decimal > 0) {
            int rem = decimal%2;
            res += (rem*pow);
            pow *= 10;
            decimal /= 2;
        }
        System.out.println(res);
    }
}
