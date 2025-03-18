package NumberLogic;

import java.util.Scanner;

public class P103_Sum {
    static int Sum(int n, int sum) {
        if(n==0) return sum;
        else {
            int rem = n%10;
            sum += rem;
            return Sum(n/10,sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int a = sc.nextInt();

        int summ = 0;
        int sum = Sum(a,summ);
        System.out.println(sum);
    }
}
