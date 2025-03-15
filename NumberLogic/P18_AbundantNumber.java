package NumberLogic;

import java.util.Scanner;

public class P18_AbundantNumber {
    static void AbundantNumber(int n) {
        int sum = 0;
        for(int i=1; i<=n/2;i++) {
            if( n%i == 0) {
                sum += i;
            }
        }

        System.out.println((sum > n) ? "It is a Abundant Number" : "It is a Not a Abundant Number");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        AbundantNumber(n);
    }
}
