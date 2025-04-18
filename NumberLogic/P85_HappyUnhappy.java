package NumberLogic;

import java.util.Scanner;

public class P85_HappyUnhappy {
    static int HappyNumber(int n) {
        int sum = 0;
        while(n>0) {
            int rem = n % 10;
            n /= 10;
            sum += rem*rem;
        }
        return (sum < 10) ? sum : HappyNumber(sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int res = HappyNumber(n);

        System.out.println((res == 1 || res == 7) ? "Happy Number" : "Unhappy Number");

    }
}
