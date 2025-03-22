package NumberLogic;

import java.util.Scanner;

public class P162_CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int count = 0;
        while(n>0) {
            n = n&(n-1);
            count++;
        }
        System.out.println(count);
    }
}
