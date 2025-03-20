package NumberLogic;

import java.util.Scanner;

public class P151_TurnOffSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        int res = a&(a-1);
        System.out.println(res);
    }
}
