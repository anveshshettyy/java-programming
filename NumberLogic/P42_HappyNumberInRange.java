package NumberLogic;

import java.util.Scanner;

public class P42_HappyNumberInRange {
    static int HappyNumber(int n) {
        int sum = 0;
        while(n>0) {
            int rem = n % 10;
            n /= 10;
            sum += rem*rem;
        }
        return (sum < 10) ? sum : HappyNumber(sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Happy Numbers are: ");
        for(int i=1; i<=n; i++) {
            int res = HappyNumber(i);
            if(res == 1) System.out.print(i+" ");
        }
    }
}
