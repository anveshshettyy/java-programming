package NumberLogic;

import java.util.Scanner;

public class P41_SpyNumbersInRange {
    static int SpyNumber(int n) {
        int sum = 0, mul = 1, temp = n;
        while(n > 0) {
            int rem = n % 10;
            sum += rem;
            mul *= rem;
            n /= 10;
        }

        return (sum==mul) ? temp : 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Spy Numbers are: ");
        for(int i=1; i<=n; i++) {
            int res = SpyNumber(i);
            if(res != 0) System.out.print(res+" ");
        }
    }
}
