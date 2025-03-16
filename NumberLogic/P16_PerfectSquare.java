package NumberLogic;

import java.util.Scanner;

public class P16_PerfectSquare {
    static void PerfectNumber(int n) {
        int sum = 0;
        for(int i=1; i<n; i++) {
            if(n%i == 0) {
                sum += i;
            }
        }
        System.out.println((sum == n) ? "It is a Perfect Number" : "It is Not a Perfect Number");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        PerfectNumber(n);
    }
}
