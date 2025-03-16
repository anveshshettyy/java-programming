package NumberLogic;

import java.util.Scanner;

public class P55_AbundantNumber {
    static int AbundantNumber(int n) {
        int sum = 0;
        for(int i=1; i<=n/2;i++) {
            if( n%i == 0) {
                sum += i;
            }
        }
        return ((sum > n) ? n : 0);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Abundant Number is: ");
        int res = 0, i = 0;
        while(n>0) {
            res = AbundantNumber(i);
            if(res != 0) 
                n--;
            i++;
        }
        System.out.println(res);
    }
}
