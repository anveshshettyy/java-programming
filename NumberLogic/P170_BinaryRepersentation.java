package NumberLogic;

import java.util.Scanner;

public class P170_BinaryRepersentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int pow = 1, res = 0;
        while(n>0) {
            int rem = n % 2;
            res += pow * rem;
            pow *= 10;
            n = n/2;
        }

        System.out.print(res);
    }
}
