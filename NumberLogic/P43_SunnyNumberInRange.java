package NumberLogic;

import java.util.Scanner;

public class P43_SunnyNumberInRange {
    static int SunnyNumber(int n) {
        int flag = 0;
        for(int i=2; i<=n/2; i++) {
            if(i*i == n) {
                flag = 1;
                break;
            }
        }  
        return ((flag == 1) ? n : 0);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Sunny Numbers are: ");
        for(int i=1; i<=n; i++) {
            int res = SunnyNumber(i);
            if(res != 0) System.out.print(res - 1+" ");
        }
    }
}
