package NumberLogic;

import java.util.Scanner;

public class P174_SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int A = sc.nextInt();

        System.out.print("Enter B: ");
        int B = sc.nextInt();

        A = A ^ B;
        B = B ^ A;
        A = A ^ B;

        System.out.println("A: "+A);
        System.out.println("B: "+B);
    }
}
