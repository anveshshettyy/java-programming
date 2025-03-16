package NumberLogic;

import java.util.Scanner;

public class P58_NthNeonNumber {
    static int NeonNumber(int n) {
        int sum = 0;
        int square = n*n;
        while(square > 0) {
            int rem = square % 10;
            square /= 10;
            sum += rem;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Neon Number is: ");
        int res = 0, i = 0;
        while(n>0) {
            res = NeonNumber(i);
            if(res == i) 
                n--;
            i++;
        }
        System.out.println(res);
    }
}
