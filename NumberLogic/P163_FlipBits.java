package NumberLogic;

import java.util.Scanner;

public class P163_FlipBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int A = sc.nextInt();

        System.out.print("Enter B: ");
        int B = sc.nextInt();

        int temp = A ^ B;
        int count = 0;
        while(temp > 0) {
            temp = temp&(temp-1);
            count++;
        }

        System.out.println(count);
    }
}
