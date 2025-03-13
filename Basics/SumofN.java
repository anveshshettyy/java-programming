package Basics;

import java.util.Scanner;

public class SumofN {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for(int i=0; i<=n; i++) {
            sum += i;
        }
        System.out.println("Sum is: "+sum);
    }
}
