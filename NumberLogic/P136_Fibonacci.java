package NumberLogic;

import java.util.Scanner;

public class P136_Fibonacci {
    static int  Fibonacci(int a, int b, int sum, int n) {
        if(n==0) return 0;
        else {
            System.out.print(a+" ");
            sum = a + b;
            a = b;
            b = sum;
            n -= 1;
            return Fibonacci(a, b, sum, n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Nnumber: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        int sum = 0;
        Fibonacci(a, b, sum, n);
    }
}
