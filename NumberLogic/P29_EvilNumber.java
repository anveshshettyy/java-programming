package NumberLogic;

import java.util.Scanner;

public class P29_EvilNumber {
    static int EvilNumber(int n) {
        int temp = n, count = 0;
        while(temp > 0) {
            if((temp&1) == 1) count++;
            temp = temp >> 1;
        }
        return (count%2 == 0) ? n : -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int res = EvilNumber(n);
        System.out.println((res==-1) ? "It is not a Evil Number" : "It is a Evil Number");
    }
}
