package NumberLogic;

import java.util.Scanner;

public class P79_KaprekarNumber {
    static int KaprekarNumber(int n) {
        int square = n*n;
        int temp = square;
        int len = 0;
        while(temp > 0) {
            len++;
            temp /= 10;
        }

        len = (len%2 == 1) ? (len/2) + 1 : len/2;
        
        int last = 0, mul=1;
        temp = square;
        while(len > 0) {
            int rem = temp % 10;
            last = rem*mul + last;
            mul *= 10;
            temp /= 10;
            len--;
        }
        temp = square;
        int first = temp / mul;
        return (first+last == n) ? 1 : 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int count = 0;
        for(int i=0; i<1000; i++) {
            int res = (KaprekarNumber(i));
            if(res == 1) {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Count is: "+count);

        // System.out.println((res == 1) ? "It is Kaprekar Number" : "It is Not  Kaprekar Number");
    }
}
