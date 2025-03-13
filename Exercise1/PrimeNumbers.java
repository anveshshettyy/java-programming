package Exercise1;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int flag = 0;

        for(int i=2; i<num / 2 ; i++) {
            if(num % i == 0) {
                flag = 1;
                break;
            } 
        }
        System.out.println((flag == 1) ? "It is a prime number" : "It is not a prime number" );
    }
}
