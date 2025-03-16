package NumberLogic;

import java.util.Scanner;

public class P45_PronicNumberInRange {
    static int PronicNumber(int n) {
        int flag = 0;
        for(int i=1; i<=n/2; i++) {
            if((i * (i+1)) == n) {
                flag = 1;
                break;
            }
        }
        return ((flag == 1 || n == 0) ? n : -1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Pronic Numbers are: ");
        for(int i=1; i<=n; i++) {
            int res = PronicNumber(i);
            if(res != -1) System.out.print(res+" ");
        }
    }
}
