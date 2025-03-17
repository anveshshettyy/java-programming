package NumberLogic;

import java.util.Scanner;

public class P90_AmicableNumber {
    static int DivisorSum(int n) {
        int sum = 0;
        for(int i=1; i<n; i++) {
            if(n%i == 0) {
                sum += i;
            }
        }
        // System.out.println(sum);

        return sum;
    }
    static void AmicableNumber(int a,int b) {
        int num1 = DivisorSum(a);
        int num2 = DivisorSum(b);

        System.out.println((num1 == b && num2 == a) ? "It is Ammicable Number" : "It is not Ammicable Number"); 
    }   
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        AmicableNumber(a,b);
    }
}
