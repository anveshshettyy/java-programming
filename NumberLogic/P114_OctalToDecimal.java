package NumberLogic;

import java.util.Scanner;

public class P114_OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        int pow = 1, res = 0;
        while (n > 0) {
            int rem = n % 10;
            res += (rem * pow);
            n /= 10;
            pow *= 8;
        }
        System.out.println(res);
    }
}
