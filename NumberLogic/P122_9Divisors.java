package NumberLogic;

import java.util.Scanner;

public class P122_9Divisors {
    static int Divisor(int n) {
        int count = 0;
        for(int i=1; i<=n ; i++ ) {
            if(n%i == 0) {
                count++;
            }
        }
        return (count == 9) ? n : 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i=1; i<n; i++) {
            int res = Divisor(i);
            if(res != 0) System.out.println(res);
        }
    }  
}
