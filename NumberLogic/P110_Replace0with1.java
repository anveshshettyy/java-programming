package NumberLogic;

import java.util.Scanner;

public class P110_Replace0with1 {
    static int Replace0w1(int n) {
        int res = 0;
        int mul = 1;
        while(n > 0) {
            int rem = n % 10;
            if(rem == 0) {
                rem = 1;
            }
            res += (rem * mul);
            mul *= 10;
            n /= 10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();

        int res = Replace0w1(num);
        System.out.println(res);
    }
}
