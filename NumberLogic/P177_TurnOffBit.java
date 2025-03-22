package NumberLogic;

import java.util.Scanner;

public class P177_TurnOffBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter i: ");
        int i = sc.nextInt();
        
        int res = n;

        if(((res>>i) & 1 ) == 1) res = n ^ 1<<i;

        System.out.println(res);
    }
}
