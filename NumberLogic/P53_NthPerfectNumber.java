package NumberLogic;

import java.util.Scanner;

public class P53_NthPerfectNumber {
    static int PerfectNumber(int n) {
        int sum = 0;
        for(int i=1; i<n; i++) {
            if(n%i == 0) {
                sum += i;
            }
        }
        return ((sum == n) ? n : 0);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Perfect Number is: ");
        int res = 0, i = 0;
        while(n>0) {
            res = PerfectNumber(i);
            if(res != 0) 
                n--;
            i++;
        }
        System.out.println(res);
    }
}
