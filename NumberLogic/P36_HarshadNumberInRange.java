package NumberLogic;

import java.util.Scanner;

public class P36_HarshadNumberInRange {
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

        System.out.print("Harshad Numbers are: ");
        for(int i=1; i<=n; i++) {
            int res = HarshadNumber(i);
            if(res != 0) System.out.print(res+" ");
        }
    }
}
