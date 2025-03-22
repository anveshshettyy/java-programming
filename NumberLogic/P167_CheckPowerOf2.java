package NumberLogic;

import java.util.Scanner;

public class P167_CheckPowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println(((n&(n-1)) == 0) ? "Power of 2" : "Not a Power of 2");
    }
}
