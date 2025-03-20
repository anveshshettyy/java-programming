package NumberLogic;

import java.util.Scanner;

public class P142_DetectOppositeSign {
    static Boolean DetectOppositeSign(int a, int b) {
        // return ((a>0 && b<0) || (a<0 && b>0)) ? 1 : 0;
        return (a ^ b) < 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        Boolean res = DetectOppositeSign(a,b);
        // System.out.println((res==1) ? "True" : "False");
        System.out.println(res);
    }
}
