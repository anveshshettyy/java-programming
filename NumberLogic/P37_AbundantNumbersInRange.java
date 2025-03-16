package NumberLogic;

import java.util.Scanner;

public class P37_AbundantNumbersInRange {
    static int AbundantNumber(int n) {
        int sum = 0;
        for(int i=1; i<=n/2;i++) {
            if( n%i == 0) {
                sum += i;
            }
        }
        return ((sum > n) ? n : 0);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Abundant Numbers are: ");
        for(int i=1; i<=n; i++) {
            int res = AbundantNumber(i);
            if(res != 0) System.out.print(res+" ");
        }
    }
}
