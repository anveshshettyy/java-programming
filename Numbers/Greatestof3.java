package Numbers;

import java.util.Scanner;

public class Greatestof3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        if ( a > b && a > c) {
            System.err.println("a is greater");
        } else if ( b > c ) {
            System.err.println("b is greater");
        } else {
            System.err.println("c is greater");
        }

    }
}
