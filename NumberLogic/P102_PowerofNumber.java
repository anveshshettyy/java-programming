package NumberLogic;

import java.util.Scanner;

public class P102_PowerofNumber {
    static int Power(int n, int x, int temp) {
        if (x != 1) {
            n = n * temp;
            x--;
            return Power(n, x, temp);
        } else {
            return n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Nnumber: ");
        int n = sc.nextInt();

        System.out.print("Enter Power: ");
        int x = sc.nextInt();
        int temp = n;
        int pow = Power(n, x, temp);
        System.out.println(pow);
    }
}
