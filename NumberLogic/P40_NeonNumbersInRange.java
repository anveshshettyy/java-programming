package NumberLogic;

import java.util.Scanner;

public class P40_NeonNumbersInRange {
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

        System.out.print("Neon Numbers are: ");
        for(int i=0; i<=n; i++) {
            int res = NeonNumber(i);
            if(res == i) System.out.print(res+" ");
        }
    }
}
