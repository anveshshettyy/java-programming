package NumberLogic;

import java.util.Scanner;

public class P70_LargestDigit {
    static int LargestDigit(int num) {
        int large = 0;
        while(num > 0) {
            int rem = num % 10;
            num /= 10;
            if(rem > large) large = rem;
        }

        return large;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        System.out.print("Largest Digit is: ");
        System.out.println(LargestDigit(num));
    }
}
