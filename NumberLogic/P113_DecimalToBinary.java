package NumberLogic;

import java.util.Scanner;

public class P113_DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int res = 0, pow = 1;
        while (n > 0) {
            int rem = n % 2;
            res += (rem * pow); 
            n /= 2;
            pow *= 10;
        }
        System.out.print(res);
    }
}
