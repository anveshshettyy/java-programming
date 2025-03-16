package NumberLogic;

import java.util.Scanner;

public class P34_StrongNumbersInRange {
    static int fact(int n) {
        return (n < 2) ? 1 : n * fact(n-1);
    }
    static int StrongNumber(int n) {
        int sum = 0, temp = n;
        while(n>0) {
            int rem = n % 10;
            sum += fact(rem);
            n /= 10;
        }
        
        return (((temp == sum) ? temp : 0));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Strong Numbers are: ");
        for(int i=0; i<=n; i++) {
            int res = StrongNumber(i);
            if(res != 0) System.out.print(res+" ");
        }
    }
}
