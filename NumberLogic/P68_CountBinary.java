package NumberLogic;

import java.util.Scanner;

public class P68_CountBinary {
    static void CountBinary(int n) {
        int oneCount = 0, zeroCount = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            if (rem == 0)
                zeroCount++;
            else if (rem == 1)
                oneCount++;
        }
        System.out.println("Count of 0 is: " + zeroCount);
        System.out.println("Count of 1 is: " + oneCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Find CountBinary: ");
        int n = sc.nextInt();

        CountBinary(n);

    }
}
