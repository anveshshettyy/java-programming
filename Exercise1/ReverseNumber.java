package Exercise1;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to reverse: ");
        int num = sc.nextInt();

        int rem = 0, rev = 0;
        while( num > 0 ) {
            rem = num % 10;
            num = num / 10;
            rev = rev * 10 + rem;
        }
        System.out.print("Reverse is: "+rev);
    }
}