package NumberLogic;

import java.util.Scanner;

public class P27_PronicNumber {
    static void PronicNumber(int n) {
        int flag = 0;
        for(int i=1; i<=n/2; i++) {
            if((i * (i+1)) == n) {
                flag = 1;
                break;
            }
        }
        System.out.println((flag == 1 || n == 0) ? "It is a Pronic Number" : "it is Not a Proic Number");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        PronicNumber(n);
    }
}
