package Methods;

import java.util.Scanner;

public class Exercise2 {
    static int res(int x, int  y) {
        int temp = y;
        int count = 0;

        while(y > 0) {
            x = x / 10;
            y = y/10;
            count++;
        }

        for(int i=0; i<count; i++) {
            x = x * 10;
        }
        return temp + x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1234;
        int y = 77;
        System.out.println(res(x,y));
    }
}
