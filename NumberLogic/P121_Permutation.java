package NumberLogic;

import java.util.Scanner;

public class P121_Permutation {
    static int fact(int n) {
        return (n==1) ? 1 : n * fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        int N = fact(n);
        int M = n - r;
        int K = fact(M);

        System.out.println(N/K);
    }
}
