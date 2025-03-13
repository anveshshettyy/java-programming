package Exercise2;

import java.util.Scanner;

public class FirstNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int rem = 0;
        while( num > 0 ) {
            rem = num % 10;
            num = num / 10;
        }
        System.out.print("First Number is: "+rem);
    }
}
