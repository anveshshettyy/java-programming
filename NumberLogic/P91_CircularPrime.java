package NumberLogic;

import java.util.Scanner;

public class P91_CircularPrime {
    static int RotateNumber(int n) {
        int temp = n, pow = 1;
        while(temp>0) {
            pow *= 10;
            temp /= 10;
        }
        pow /= 10;
        int first = n%10;
        int last = n/10;
        
        System.out.println(first*pow + last);
        return (first*pow + last);
    }

    static int isPrime(int n) {
        int flag = 0;
        for (int i = 2; i <=n/2; i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }
        return (flag == 1) ? 1 : 0;
    }

    static int CircularPrime(int n) {
        int temp = n, len = 0, flag = 0;
        while(temp>0) {
            len++;
            temp /= 10;
        }
        int rotate = n;
        for(int i=0; i<len; i++) {
            if(isPrime(rotate)==0) {
                rotate = RotateNumber(rotate);
            } else{
                flag = 1;
                break;
            } 
        }
        return (flag == 1) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int res = CircularPrime(num);
        System.out.println((res == 1) ? "It is not Circular Prime" : "It is Circular Prime");
 
    }
}