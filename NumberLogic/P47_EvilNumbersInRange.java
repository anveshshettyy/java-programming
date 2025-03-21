package NumberLogic;

import java.util.Scanner;

public class P47_EvilNumbersInRange {
    static int EvilNumber(int n) {
        int temp = n, count = 0;
        while(temp > 0) {
            if((temp&1) == 1) count++;
            temp = temp >> 1;
        }
        return (count%2 == 0) ? n : -1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i=0; i<=n; i++) {
            int res = EvilNumber(i);
            if(res != -1) System.out.print(res+" "); 
        }
    }
}
