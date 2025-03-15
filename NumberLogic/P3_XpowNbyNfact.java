package NumberLogic;

import java.util.Scanner;

public class P3_XpowNbyNfact {
    static int Fact(int n) {
        return (n==1) ? 1 : n *Fact(n-1);
    }
    static int Power(int n, int x) {
        int temp = x;
        for(int i=1; i<n; i++) {
            temp *= x;
        }
        return temp;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter x: ");
        int x = sc.nextInt();

        double val1 = Fact(n);
        double val2 = Power(n,x);
        double res = val2 / val1;
        System.out.println(res);
    }
}
