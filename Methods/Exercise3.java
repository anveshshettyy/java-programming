package Methods;

import java.util.Scanner;

public class Exercise3 {
    static int res(int x) {
        return x % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1234;
        System.out.println(res(x));
    }
}
