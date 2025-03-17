package NumberLogic;

import java.util.Scanner;

public class P87_HarshadNumber {
    static void HarshadNumber(int n) {
        int sum = 0, temp = n;
        while(temp > 0) {
            int rem = temp % 10;
            temp /= 10;
            sum += rem;
        }
        
        System.out.println((n % sum == 0) ? "It is a Harshad Number" : "It is a Not a Harshad Number");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        HarshadNumber(n);
    }
}
