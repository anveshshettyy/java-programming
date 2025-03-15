package NumberLogic;

import java.util.Scanner;

public class P4_NumofDigits {
    static int Len(int n) {
        int count=0;
        while(n>0) {
            count++;
            n /= 10;
        }
        return count;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println(Len(n));
    }
}
