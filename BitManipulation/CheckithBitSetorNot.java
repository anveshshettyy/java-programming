package BitManipulation;

import java.util.Scanner;

public class CheckithBitSetorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter i: ");
        int i = sc.nextInt();

        int res = n >> i;
        if((res & 1) == 1) System.out.println("It is set");
        else System.out.println("It is not set");
    }
}
