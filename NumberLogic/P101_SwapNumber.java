package NumberLogic;

import java.util.Scanner;

public class P101_SwapNumber {
    static void SwapNumbers(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: "+a);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        SwapNumbers(a,b);

    }
}
