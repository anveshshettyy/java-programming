package NumberLogic;

import java.util.Scanner;

public class P13_PerfectSquare {
    static void PerfectSquare(int n) {
        int flag = 0;
        for(int i=2; i<n/2; i++) {
            if(i*i == n) {
                flag = 1;
            }
        }
        
        System.out.println((flag == 0) ? "It is Not a Perfect Square Number" : "It is a Perfect Square Number");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        PerfectSquare(n);
    }
}
