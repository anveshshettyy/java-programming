package NumberLogic;

import java.util.Scanner;

public class P12_PrimeNumber {
    static void IsPrime(int n) {
        int flag = 0;
        for(int i=2; i<n/2; i++) {
            if(n%i == 0) {
                flag = 1;
                break;
            }
        }
        
        System.out.println((flag == 0) ? "It is a Prime Number" : "It is Not a Prime Number");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        IsPrime(n);
    }
}
