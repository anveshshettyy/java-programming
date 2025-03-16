package NumberLogic;

import java.util.Scanner;

public class P49_NthPrimeNumber {
    static int PrimeNumber(int n) {
        int flag = 0;
        for(int i=2; i<=n/2; i++) {
            if(n%i == 0) {
                flag = 1;
                break;
            }
        }
        return (flag == 1) ? 0 : n; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Prime Number is: ");

        int i=0, res = 0;
        while( n>0) {
            res = PrimeNumber(i);
            if(res != 0)  n--;
            i++;
        }
        System.out.println(res);
    }
}
