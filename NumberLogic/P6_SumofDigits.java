package NumberLogic;

import java.util.Scanner;

public class P6_SumofDigits {
    static int SumofDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;;
            n /= 10;
            sum += rem;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Sum is:"+SumofDigits(n));
    }
}
