package Methods;

import java.util.Scanner;

public class Exercise5 {
    static int res(int x) {
        int rem = 0;
        while( x > 0 ) {
            rem = x % 10;
            x = x / 10;
        }
        return rem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 12345;
        System.out.println(res(x));
    }
}
