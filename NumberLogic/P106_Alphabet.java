package NumberLogic;

import java.util.Scanner;

public class P106_Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        char c = sc.next().charAt(0);

        int num = c;
        if((num >= 65 && num <= 90) || (num >= 97 && num <= 99+26)) {
            System.out.println("It is a Alphabet");
        } else {
            System.out.println("It is not a Alphabet");
        }
    }
}
