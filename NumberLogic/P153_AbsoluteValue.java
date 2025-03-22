package NumberLogic;

import java.util.Scanner;

public class P153_AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if(n<0)  n = (~n) + 1;
        System.out.println(n);
    }
}
