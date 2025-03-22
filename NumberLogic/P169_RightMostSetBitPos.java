package NumberLogic;

import java.util.Scanner;

public class P169_RightMostSetBitPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int count = 0;
        while(n>0) {
            count++;
            if((n&1)==1) {
                break;
            }
            n = n>>1;
        }

        System.out.println("Position: "+count);
    }
}
