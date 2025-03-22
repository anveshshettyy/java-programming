package NumberLogic;

import java.util.Scanner;

public class P155_MinMaxof2Integers {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter m: ");
        int m = sc.nextInt();

        System.out.println((m>n) ? "m is greater and n is smaller" : "n is greater and m is smaller");
    }
}
