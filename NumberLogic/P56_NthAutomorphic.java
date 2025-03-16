package NumberLogic;

import java.util.Scanner;

public class P56_NthAutomorphic {
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

        System.out.println("Automorphic Number is: ");
        int res = 0, i = 0;
        while(n>0) {
            res = AutomorphicNumber(i);
            if(res != 0) 
                n--;
            i++;
        }
        System.out.println(res);
    }
}
