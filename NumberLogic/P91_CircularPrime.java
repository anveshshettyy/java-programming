package NumberLogic;

import java.util.Scanner;

public class P91_CircularPrime {
    static void CyclicPrime(int n) {
        int flag = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            if (rem == 0 || rem == 2 || rem == 4 || rem == 5 || rem == 6 || rem == 8) {
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("It is a Circular Prime");
        } else {
            System.out.println("It is not a Circular Prime");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num == 2 || num == 3 || num == 5 || num == 7) {
            System.out.println("It is a Circular Prime");
        } else {
            CyclicPrime(num);

        }

    }
}