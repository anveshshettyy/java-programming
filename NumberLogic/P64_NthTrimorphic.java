package NumberLogic;

import java.util.Scanner;

public class P64_NthTrimorphic {
    static int TrimorphicNumber(int n) {
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
        return ((n == res) ? n : -1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Trimorphic Number is: ");
        int res = 0, i = 1;
        while(n>0) {
            res = TrimorphicNumber(i);
            if(res != -1) 
                n--;
            i++;
        }
        System.out.println(res);
    }
}
