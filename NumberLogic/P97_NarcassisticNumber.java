package NumberLogic;

import java.util.Scanner;

public class P97_NarcassisticNumber {
    static int Narcissistic(int n) {
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
        
        return ((sum == n) ? n : 0 );
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Narcissistic Numbers are: ");
        for(int i=0; i<=n; i++) {
            int res = Narcissistic(i);
            if(res != 0) System.out.print(res+" ");
        }
    }
}
