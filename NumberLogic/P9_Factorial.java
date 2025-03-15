package NumberLogic;

import java.util.Scanner;

public class P9_Factorial {
    static int Factorial(int n) {
        return (n == 1) ? 1 : n*Factorial(n-1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Factorial is: " + Factorial(n));
    }
}
