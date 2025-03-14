package Methods;
import java.util.Scanner;

public class Execrsie1 {
    static int res(int x, int  y) {
        int temp = y;
        while(y > 0) {
            x = x * 10;
            y = y/10;
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
