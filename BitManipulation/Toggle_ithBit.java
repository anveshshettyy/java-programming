package BitManipulation;

import java.util.Scanner;

public class Toggle_ithBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter i: ");
        int i = sc.nextInt();

        System.out.println(n ^( 1<<i ));
    }
}
