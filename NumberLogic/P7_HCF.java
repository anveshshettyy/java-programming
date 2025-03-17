package NumberLogic;

import java.util.Scanner;

public class P7_HCF {
    static int HCF(int a, int b) {
        int less = (a < b) ? a : b ;
        while((a%less != 0) || (b%less != 0)) less--;
        return less;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println("HCF is: "+HCF(a,b));
    }
}