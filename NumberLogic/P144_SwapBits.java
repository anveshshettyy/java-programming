package NumberLogic;

import java.util.Scanner;

public class P144_SwapBits {
    static void SwapBits(int n) {
        int temp = ~n;
        System.out.println(temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        SwapBits(n);
        
    }
}
