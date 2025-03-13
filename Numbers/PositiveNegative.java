package Numbers;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("Number is Positive");
        } else if (num == 0) {
            System.out.println("Number is 0");
        } else {
            System.out.println("Number is Negative");
        }
    }
}
