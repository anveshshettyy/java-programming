package NumberLogic;

import java.util.Scanner;

public class P132_BabylonianMethodRoot {
    static double BablyonianRoot(int n) {
        double x = n;
        double y = 1;

        double e = 0.000001;
        while(x-y > e) {
            x = (x + y) / 2;
            y = n / x;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(BablyonianRoot(n));

    }
}
