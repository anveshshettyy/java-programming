package NumberLogic;

import java.util.Scanner;

public class P54_NthHashardNumber {
    static int HarshadNumber(int n) {
        int sum = 0, temp = n;
        while(temp > 0) {
            int rem = temp % 10;
            temp /= 10;
            sum += rem;
        }
        
        return ((n % sum == 0) ? n : 0);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Harshad Number is: ");
        int res = 0, i = 1;
        while(n>0) {
            res = HarshadNumber(i);
            if(res != 0) 
                n--;
            i++;
        }
        System.out.println(res);
    }
}
