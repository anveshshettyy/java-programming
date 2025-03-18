package NumberLogic;

import java.util.Scanner;

public class P125_QuadraticRoots {
    static void Roots(int res) {
        if(res > 0) {
            System.out.println("There are 2 Distinct real roots");
        } else if(res < 0) {
            System.out.println("there are two complex (non-real) roots.");
        } else {
            System.out.println("there is one real root");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int res = (b*b) - 4 * a * c;

        Roots(res);
    }
}
