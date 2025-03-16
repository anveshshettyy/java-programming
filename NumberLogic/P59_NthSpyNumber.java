package NumberLogic;

import java.util.Scanner;

public class P59_NthSpyNumber {
    static int SpyNumber(int n) {
        int sum = 0, mul = 1, temp = n;
        while(n > 0) {
            int rem = n % 10;
            sum += rem;
            mul *= rem;
            n /= 10;
        }

        return (sum==mul) ? temp : 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Spy Number is: ");
        int res = 0, i = 0;
        while(n>0) {
            res = SpyNumber(i);
            if(res != 0) 
                n--;
            i++;
        }
        System.out.println(res);
    }
}
