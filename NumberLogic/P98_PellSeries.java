package NumberLogic;

import java.util.Scanner;

public class P98_PellSeries {
    static void PellSeries(int n) {
        int a = 0;
        int b = 1;
        while(n>0) {
            System.out.print(a+" ");
            int sum = 2*b + a;
            a = b;
            b = sum;
            n--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        PellSeries(n);
    }
}
