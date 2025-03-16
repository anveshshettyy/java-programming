package NumberLogic;

import java.util.Scanner;

public class P46_TrimorphicNumberInRange {
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

        System.out.print("Trimorphic Numbers are: ");
        for(int i=0; i<=n; i++) {
            int res = TrimorphicNumber(i);
            if(res != -1) System.out.print(res+" ");
        }
    }
}
