package NumberLogic;

import java.util.Scanner;

public class P113_DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        int pow = 1, res = 0;
        while (n > 0) {
            int rem = n % 8;
            res += (rem * pow);
            n /= 8;
            pow *= 10;
        }
        System.out.println(res);
    }
}
