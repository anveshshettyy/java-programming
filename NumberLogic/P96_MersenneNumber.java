package NumberLogic;

import java.util.Scanner;

public class P96_MersenneNumber {

    static int MersenneNumber(int num) {
        int pow = 1, n=num+1, flag=0;
        for(int i=0; i<n; i++) {
            pow = pow * 2;
            if(pow-1 == num) {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int res = MersenneNumber(num);
        System.out.println((res == 1) ? "It is a Mersenne Number" : "It is Not a Mersenne Number");

    }
}
