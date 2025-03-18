package NumberConversion;

import java.util.Scanner;

public class HexaToBinary {
    static int HexaToDecimal(int n){
        int res = 0, mul = 1;
        while(n>0) {
            int rem = n%10;
            res += rem * mul;
            n /= 10;
            mul *= 10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int decimal = HexaToDecimal(n);

        int res = 0, mul = 1;
        while(decimal>0) {
            int rem = decimal % 2;
            res += rem * mul;
            decimal /= 2;
            mul *= 10;
        }
        System.out.println(res);
    }
}
