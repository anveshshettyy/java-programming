package NumberLogic;

import java.util.Scanner;

public class P39_MagicNumberInRange {
    static int MagicNumber(int n) {
        int temp = n, sum = 0;
        while(temp > 0) {
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }
        return (sum < 10) ? sum : MagicNumber(sum);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Magic Numbers are: ");
        for(int i=1; i<=n; i++) {
            int res = MagicNumber(i);
            if(res == 1)  System.out.print(i+" ");
        }
    }
}
