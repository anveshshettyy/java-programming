package NumberLogic;

import java.util.Scanner;

public class P29_EvilNumber {
    static void EvilNumber(int n) {
        int mul=1, res = 0;
        int triplet = n*n*n;
        while(triplet > 0) {
            int rem = triplet % 10;
            res = rem *mul + res;
            mul *= 10;
            if(res == n) {
                break;
            }
            triplet /= 10;
        }
        System.out.println((n == res) ? "It is a Trimorphic Number" : "It is a Not a Trimorphic Number");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        EvilNumber(n);
    }
}
