package NumberLogic;

import java.util.Scanner;

public class P75_OddEvenDigits {
    static void EvenOdd(int n) {
        int OddCount = 0, EvenCount = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            if (rem % 2 == 0) EvenCount++;
            else OddCount++;
        }
        System.out.println("Even Count is: " + EvenCount);
        System.out.println("Odd Count  is: " + OddCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Find Even Odd Numbers: ");
        int n = sc.nextInt();

        EvenOdd(n);

    }
}
