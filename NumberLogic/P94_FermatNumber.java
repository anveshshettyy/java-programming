package NumberLogic;

import java.util.Scanner;

public class P94_FermatNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        long num = sc.nextInt();

        long pow = 1;
        for(long i=0; i<num; i++) {
            pow = pow * 2;
        }
        long res = 1;
        for(long i=0; i<pow; i++) {
            res = res * 2;
        }

        System.out.println(res+1);
    }
}
