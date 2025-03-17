package NumberLogic;

import java.util.Scanner;

public class P82_LucasNumber {
    static void Lucas(int n) {
        int a = 2;
        int b = 1;
        for(int i=0; i<n; i++) {
            System.out.print(a+" ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Lucas Numbers are: ");
        Lucas(n);
    }
}
