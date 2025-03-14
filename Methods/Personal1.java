package Methods;

import java.util.Scanner;

public class Personal1 {
    static int res(int x, int n) {
        int rem=0, rev = 0, temp = x, count  = 0;
        while(temp > 0) {
            temp = temp / 10; 
            count++;
        }

        count = count - n - 1;
        
        while( count >= 0 ) {
            rem = x % 10;
            x = x / 10;
            rev = rev*10 + rem;
            count--;
        }

        int reve=0;
        while( rev > 0 ) {
            int rem2 = rev % 10;
            rev = rev / 10;
            reve = reve * 10 + rem2;
        }
        
        return reve;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 12345, n = 2;
        System.out.println(res(x,n));
    }
}
