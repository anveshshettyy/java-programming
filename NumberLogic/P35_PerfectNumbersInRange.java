package NumberLogic;

import java.util.Scanner;

public class P35_PerfectNumbersInRange {
    static int PerfectNumber(int n) {
        int sum = 0;
        for(int i=1; i<n; i++) {
            if(n%i == 0) {
                sum += i;
            }
        }
        return ((sum == n) ? n : 0);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Strong Numbers are: ");
        for(int i=0; i<=n; i++) {
            int res = PerfectNumber(i);
            if(res != 0) System.out.print(res+" ");
        }
    }
}
