package NumberLogic;

import java.util.Scanner;

public class P91_CircularPrime {
    static int isPrime(int n) {
        int flag = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    static int Rotate(int n) {
        int temp = n;
        int len = 0, mul = 1;
        while (temp > 0) {
            len++;
            temp /= 10;
            mul *= 10;
        }
        int remNumber = n / 10;

        int lastNum = n % 10;
        lastNum *= mul / 10;
        int rotatedNum = remNumber + lastNum;
        return rotatedNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int temp = n, flag = 0, len = 0;
        while (temp > 0) {
            int rem = temp % 10;
            temp /= 10;
            if (rem % 2 == 0) {
                flag = 1;
                break;
            }
            len++;
        }
        int res = n;
        if (flag == 0) {
            for (int i = 0; i < len; i++) {
                if (isPrime(res) == 0) {
                    System.out.println("It is not a Circular Prime");
                    res = Rotate(res);
                } else {
                    System.out.println("It is a Circular Prime");
                    break;
                }
                

            }
        } else {
            System.out.println("It is not a Circular Prime");
        }

        // System.out.println(Rotate(n));
    }
}