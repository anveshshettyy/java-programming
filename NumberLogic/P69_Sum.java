package NumberLogic;

import java.util.Scanner;

public class P69_Sum {
    static int Sum(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

        System.out.println(Sum(a,b)); 
    }
}
