package Methods;

import java.util.Scanner;

public class Exercise7 {
    static int res(int x, int y) {
        int temp = y;
        while (y > 0) {
            x = x * 10;
            y = y / 10;
        }
        return temp + x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 77;
        int y = 1234;
        System.out.println(res(x, y));
    }
}
