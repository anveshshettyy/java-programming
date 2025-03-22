package NumberLogic;

import java.util.Scanner;

public class P171_SwapOddnEvenBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int temp1 = n>>1;
        int temp2 = n;

        int count = 0;
        while((temp1 > 0) || (temp2 > 0)) {
            count++;
            if((((temp1&1) == 1)&&(temp2&1)==0)) {
                int temp3 = 1<<count;
                n = n^temp3;
                int temp4 = 1<<count+1;
                n = n^temp4;
            }
            temp1 = temp1 >>1;
            temp2 = temp2 >>1;
        }

        System.out.println(n);
    }
}
