package NumberLogic;

import java.util.Scanner;

public class P111_ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  a Character: ");
        char c = sc.next().charAt(0);

        int res = c;
        System.out.println("ASCII value is: "+res);
    }
}
