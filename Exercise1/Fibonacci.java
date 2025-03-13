package Exercise1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int a=0, b=1, sum = 0;
        for(int i=0; i<num; i++) {
            System.out.println(a);
            sum = a+b;
            a = b; 
            b = sum;
        }
    }
}
