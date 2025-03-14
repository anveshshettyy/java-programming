package Methods;

import java.util.Scanner;

public class Exercise8 {
    static int res(int x, int  y) {
        int temp1 = x,temp2 = y, count1 = 0, count2 = 0;
        while( temp1 > 0 ) {
            temp1 = temp1 / 10;
            count1++;
        }

        while( temp2 > 0 ) {
            temp2 = temp2 / 10;
            count2++;
        }

        count1 = count2 - count1;

        temp1 = y;
        int rem = 0, rev = 0;
        for(int i=0; i<count1; i++) {
            rem = temp1 % 10;
            temp1 = temp1 / 10;
            rev = rev*10 + rem;
            x = x * 10;
        }

        int rev2= 0;
        while(rev > 0) {
            rem = rev % 10;
            rev = rev / 10;
            rev2 = rev2 * 10 + rem;
        }
        return x + rev2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 77;
        int y = 123456;
        System.out.println(res(x,y));
    }
}
