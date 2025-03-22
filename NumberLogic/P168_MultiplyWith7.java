package NumberLogic;

import java.util.Scanner;

public class P168_MultiplyWith7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        n = (n<<3) - n;
        System.out.println(n);
    }
}
