package NumberLogic;

import java.util.Scanner;

public class P99_KeithNumber {
    static int KeithNumber(int n) {
        int res = 0;
        while(n>0) {
            int rem = n % 10;
            n /= 10;
            res += rem;
        }
        return (res > n) ? KeithNumber(res) : res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int res = KeithNumber(n);
        System.out.println(res);
        
    }
}
