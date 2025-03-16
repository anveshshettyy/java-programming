package NumberLogic;

import java.util.Scanner;

public class P31_PrimeInRange {
    static int PrimeNumber(int n) {
        int flag = 0;
        for(int i=2; i<=n/2; i++) {
            if(n%i == 0) {
                flag = 1;
                break;
            }
        }
        return (flag == 0) ? n : 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Prime Numbers in range "+n+" are: ");
        for(int i=2; i<=n; i++) {
            int res = PrimeNumber(i);
            if(res != 0) System.out.print(res+" ");
        }
    }
}
