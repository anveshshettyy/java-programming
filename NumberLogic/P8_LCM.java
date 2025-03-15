package NumberLogic;

import java.util.Scanner;

public class P8_LCM {
    static int LCM(int a, int b) {
        int less = (a < b) ? a : b;

        int i;
        for(i=2; i<less; i++) {
            if((a%i == 0) && (b%i == 0)) break;
        }

        return i;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println("LCM is: " + LCM(a, b));
    }
}
