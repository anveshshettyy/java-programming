package NumberLogic;

import java.util.Scanner;

public class P19_AutomorphicNumber {
    static void AutomorphicNumber(int n) {
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
        System.out.println((n == res) ? "It is a Automorphic Number" : "It is a Not a Automorphic Number");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        AutomorphicNumber(n);
    }
}
