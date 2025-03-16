package NumberLogic;

import java.util.Scanner;

public class P32_PerfectSquareRange {
    static int PerfectSquare(int n) {
        int flag = 0;
        for(int i=0; i<n; i++) {
            if(i*i == n) {
                flag = 1;
                break;
            }
        }
        return (flag != 0) ? n : 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Perfect Square Numbers are: ");
        for(int i=0; i<=n; i++) {
            int res = PerfectSquare(i);
            if(res != 0) System.out.print(res+" ");
        }
    }
}
