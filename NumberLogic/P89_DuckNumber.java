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
        String str = sc.nextLine();

        if(str.charAt(0) == '0') {
            System.out.println("It is not a Duck Number");
        } else {
            int n = Integer.parseInt(str);
            DuckNumber(n);
        }
    }
}
