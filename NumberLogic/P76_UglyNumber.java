package NumberLogic;

import java.util.Scanner;

public class P76_UglyNumber {
    static void UglyNumber(int n) {
        while (n%2 == 0 ) n /= 2;
        while (n%3 == 0 ) n /= 3;
        while (n%5 == 0 ) n /= 5;
        
        System.out.println((n == 1) ? "It is a Ugly Number" : "It is not a Ugly Number");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        UglyNumber(num);
    }
}
