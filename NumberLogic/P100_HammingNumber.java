package NumberLogic;

import java.util.Scanner;

public class P100_HammingNumber {
    static void isHammingNumber(int n) {
        for(int i=6; i<30; i++) {
            if(n%i == 0)
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        isHammingNumber(n);
        
    }
}
