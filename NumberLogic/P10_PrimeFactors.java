package NumberLogic;

import java.util.Scanner;

public class P10_PrimeFactors {
    static void PrimeFactor(int n) {
        int i=2;
        while(n>1) {
            if(n%i == 0) {
                n = n / i;
                System.out.print(i+" ");
            } else i++;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Prime Factors are: ");
        PrimeFactor(n);
    }
}
