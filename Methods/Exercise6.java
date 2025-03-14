package Methods;

import java.util.Scanner;

public class Exercise6 {
    static int res(int x) {
        int temp = x;
        int rem = 0;
        int count = 0;
        while( x > 0 ) {
            rem = x % 10;
            x = x / 10;
            count++;
        }

        for(int i=1; i<count; i++) 
            rem = rem * 10;
        
        return temp - rem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1234;
        System.out.println(res(x));
    }
}
