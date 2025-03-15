package NumberLogic;

import java.util.Scanner;

public class P14_ArmstrongNumber {
    static void ArmstrongNumber(int n) {
        int count = 0, temp = n, sum = 0;

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
        
        System.out.println((sum == n) ? "It is a Armstrong Number" : "It is Not a Armstrong Number");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        ArmstrongNumber(n);
    }
}
