package NumberLogic;

import java.util.Scanner;

public class P71_SmallestDigit {
    static int SmallestDigit(int num) {
        int small = 10;
        while(num > 0) {
            int rem = num % 10;
            num /= 10;
            if(rem < small) small = rem;
        }

        return small;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        System.out.print("Smallest Digit is: ");
        System.out.println(SmallestDigit(num));
    }
}
