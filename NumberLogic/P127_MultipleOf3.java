package NumberLogic;

import java.util.Scanner;

public class P127_MultipleOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println((n%3 == 0) ? "It is a Multiple of 3" : "It is not a multiple of 3");
    }
}
