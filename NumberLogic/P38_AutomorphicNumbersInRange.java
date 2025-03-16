package NumberLogic;

import java.util.Scanner;

public class P38_AutomorphicNumbersInRange {
    static int AutomorphicNumber(int n) {
        int mul=1, res = 0;
        int square = n*n;
        while(square > 0) {
            int rem = square % 10;
            res = rem *mul + res;
            mul *= 10;
            if(res == n) {
                break;
            }
            square /= 10;
        }
        return ((n == res) ? n : 0);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Automorphic Numbers are: ");
        for(int i=1; i<=n; i++) {
            int res = AutomorphicNumber(i);
            if(res != 0) System.out.print(res+" ");
        }
    }
}
