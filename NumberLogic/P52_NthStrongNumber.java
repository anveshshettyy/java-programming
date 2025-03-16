package NumberLogic;

import java.util.Scanner;

public class P52_NthStrongNumber {
    static int fact(int n) {
        return (n < 2) ? 1 : n * fact(n-1);
    }
    static int StrongNumber(int n) {
        int sum = 0, temp = n;
        while(n>0) {
            int rem = n % 10;
            sum += fact(rem);
            n /= 10;
        }
        
        return (((temp == sum) ? temp : 0));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Strong Number is: ");
        int res = 0, i = 0;
        while(n>0) {
            res = StrongNumber(i);
            if(res != 0) 
                n--;
            i++;
        }
        System.out.println(res);
    }
}
