package NumberLogic;

import java.util.Scanner;

public class P67_GenericRoot {
    static int GenericRoot(int n) {
        int sum = 0;
        while(n>0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }

        return (sum < 10) ? sum : GenericRoot(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Find GenericRoot: ");
        int n = sc.nextInt();

        System.out.print("Generic Root is: ");
        int res = GenericRoot(n);
        System.out.println(res);
    }
}
