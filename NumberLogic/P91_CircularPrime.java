package NumberLogic;

import java.util.Scanner;

public class P91_CircularPrime {
    static int RotateNumber(int n) {
        int first = 0;
        int rem = 0;

        first = n%10;
        rem = n / 10;

        return rem;
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

    static void CircularPrime(int n) {
        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        // CircularPrime(num);
        System.out.println(RotateNumber(num));

    }
}