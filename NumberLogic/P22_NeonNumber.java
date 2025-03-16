package NumberLogic;

import java.util.Scanner;

public class P22_NeonNumber {
    static int NeonNumber(int n) {
        int sum = 0;
        int square = n*n;
        while(square > 0) {
            int rem = square % 10;
            square /= 10;
            sum += rem;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int res = (NeonNumber(n));

        System.out.println((res == n) ? "It is a Neon Number" : "It is Not a Neon Number");
    }
}
