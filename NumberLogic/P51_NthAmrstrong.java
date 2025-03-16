package NumberLogic;

import java.util.Scanner;

public class P51_NthAmrstrong {
    static int ArmstrongNumber(int n) {
        int count = 0, temp = n, sum = 0;
        int flag = 0;
        while(temp > 0) {
            count++;
            temp /= 10;
        }

        temp = n;
        
        while(temp > 0) {
            int rem = temp % 10;
            int copy = rem;
            for(int i=1; i<count; i++) copy = copy  * rem;
            sum += copy;
            temp /= 10;
        }
        
        return ((sum == n) ? n : -1 );
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Armstrong Number is: ");
        int res = 0, i = 0;
        while(n>0) {
            res = ArmstrongNumber(i);
            if(res != -1) 
                n--;
            i++;
        }
        System.out.println(res);
    }
}
