package BitManipulation;

import java.util.Scanner;

public class RemoveLastSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int m = n - 1;
        int res = n&m;
        System.out.println(res);
    }
}
