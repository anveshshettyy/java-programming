package BitManipulation;

import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();   

        int count = 0;
        int res = n;
        // while(n>0) {
        //     if((res & 1) == 1) count++;
        //     res = n >> 1;
        //     n = n >> 1;
        // } 
        // System.out.println(count);

        while(n>0) {
            n = n&(n-1);
            count++;
        }
        System.out.println(count);
    }
}
