package NumberLogic;

import java.util.Scanner;

public class P89_DuckNumber {
    static void DuckNumber(int n) {
        int flag = 0;
        while(n > 0) {
            int rem = n % 10;
            n /= 10;
            if(rem == 0) {
                flag = 1;
                break;
            }
        }
        System.out.print((flag == 1) ? "It is a Duck Number" : "It is Not a Duck Number");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int temp = n, num = 1;
        while( temp > 0) {
            num *= 10;
            temp /= 10;
        }
        num = num / 10;

        

        System.out.println(num);

        // DuckNumber(n);
    }
}
