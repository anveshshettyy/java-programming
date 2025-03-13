package Exercise1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        System.out.print((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ? "It is a Leap Year!" : "It is not a Leap Year!" );
    }
}
