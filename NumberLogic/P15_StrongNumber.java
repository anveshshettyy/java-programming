package NumberLogic;

import java.util.Scanner;

public class P15_StrongNumber {
    static int fact(int n) {
        return (n < 2) ? 1 : n * fact(n-1);
    }
    static void StrongNumber(int n) {
        int sum = 0, temp = n;
        while(n>0) {
            int rem = n % 10;
            sum += fact(rem);
            n /= 10;
        }
        
        System.out.println(((temp == sum) ? "It is a Strong Number" : "It is not a Strong Number"));
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        StrongNumber(n);
    }
}
