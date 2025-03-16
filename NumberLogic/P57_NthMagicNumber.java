package NumberLogic;

import java.util.Scanner;

public class P57_NthMagicNumber {
    static int MagicNumber(int n) {
        int temp = n, sum = 0;
        while(temp > 0) {
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }
        return (sum < 10) ? sum : MagicNumber(sum);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Magic Number is: ");
        int res = 0, i = 0;
        while(n>0) {
            res = MagicNumber(i);
            if(res == 1) 
                n--;
            i++;
        }
        System.out.println(i-1);
    }
}
