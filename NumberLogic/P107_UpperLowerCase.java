package NumberLogic;

import java.util.Scanner;

public class P107_UpperLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character: ");
        char c = sc.next().charAt(0);

        int num = c;

        System.out.println((num >= 65 && num <= 90) ? "It is Upper Case" : ((num >= 97 && num <= 122)  ? "It is Lower case" : "It is Special Character") );
    }
}
