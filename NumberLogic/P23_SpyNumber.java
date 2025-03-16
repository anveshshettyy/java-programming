package NumberLogic;

import java.util.Scanner;

public class P23_SpyNumber {
    static void SpyNumber(int n) {
        int sum = 0, mul = 1;
        while(n > 0) {
            int rem = n % 10;
            sum += rem;
            mul *= rem;
            n /= 10;
        }

        System.out.println("Sum: "+sum);
        System.out.println("Product: "+mul);

        System.out.println((sum==mul) ? "It is a Spy Number" : "It is Not a Spy Number");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        SpyNumber(n);

    }
}
