package NumberLogic;

import java.util.Scanner;

public class P149_AddOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        a = ~a;
        System.out.println(a*-1);
    }
}
