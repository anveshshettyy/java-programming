package NumberLogic;

import java.util.Scanner;

public class P60_NthHappyNumber {
    static int HappyNumber(int n) {
        int sum = 0;
        while(n>0) {
            int rem = n % 10;
            n /= 10;
            sum += rem*rem;
        }
        return (sum < 10) ? sum : HappyNumber(sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Happy Number is: ");
        int res = 0, i = 1;
        while(n>0) {
            res = HappyNumber(i);
            if(res == 1) 
                n--;
            i++;
        }
        System.out.println(i-1);
    }
}
