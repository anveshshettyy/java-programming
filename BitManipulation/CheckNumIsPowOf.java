package BitManipulation;

import java.util.Scanner;

public class CheckNumIsPowOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int res = 0;
        res = 1<<n;

        System.out.println(res);

    }
}
