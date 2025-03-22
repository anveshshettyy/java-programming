package NumberLogic;

import java.util.Scanner;

public class P95_RamanujanNumber {
    static void RamanujanNumber(int n){
        int temp = n, len = 0;
        while(temp>0) {
            len++;
            temp /= 10;
        }

        len = len/2; temp = n;
        int pow = 1, last = 0;
        for(int i = 0; i<len; i++) {
            int rem = temp % 10;
            last += rem*pow;
            temp /= 10;
            pow *=10;
        }

        int first = n / pow;
        System.out.println(first+"   "+last);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        RamanujanNumber(n);
    }
}
