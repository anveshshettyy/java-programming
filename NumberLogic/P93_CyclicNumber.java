package NumberLogic;

import java.util.Scanner;

public class P93_CyclicNumber {
    static int RotateNumber(int n) {
        int temp = n, pow = 1;
        while(temp>0) {
            pow *= 10;
            temp /= 10;
        }
        pow /= 10;
        int first = n%10;
        int last = n/10;
        
        return (first*pow + last);
    }
    static int CheckIsPresent(int n) {
        int temp = n, len = 0, flag = 0;
        while(temp>0) {
            len++;
            temp /= 10;
        }
        int rotate = n;

        for(int i=0; i<len; i++) {
            if(RotateNumber(rotate) == n) {
                flag = 1;
                break;
            } else {
                rotate = RotateNumber(rotate);
            }
        }
        return (flag==1) ? 1 : 0;
    }

    static void CyclicNumber(int n) {
        int temp = n, len = 0, flag = 0;
        while(temp>0) {
            len++;
            temp /= 10;
        }
        for(int i=1; i<=len; i++) {
            int mul = i*n;
            if(CheckIsPresent(mul) == 0) {
                flag = 1;
                break;
            }
        }
        System.out.println((flag ==1) ? "It is not Cyclic Number" : "It is a Cyclic number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<10) {
            System.out.println("It is not a Cyclic Number");
        } else {
            CyclicNumber(n);
        }
    }
}
