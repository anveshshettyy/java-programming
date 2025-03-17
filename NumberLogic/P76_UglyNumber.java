package NumberLogic;

import java.util.Scanner;

public class P76_UglyNumber {
    static void UglyNumber(int n) {
        int flag = 0;
        if(n % 2 == 0 || n % 3 == 0 || n % 5 == 0 ) 
            flag = 1;
        System.out.println((flag == 1) ? "It is a Ugly Number" : "It is not a Ugly Number");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        UglyNumber(num);
    }
}
