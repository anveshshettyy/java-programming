package NumberLogic;

import java.util.Scanner;

public class P20_MagicNumber {
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

        int res = (MagicNumber(n));

        System.out.println((res == 1) ? "It is a Magic Number" : "It is Not a Magic Number");
    }
}
