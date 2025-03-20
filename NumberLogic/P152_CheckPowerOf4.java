package NumberLogic;

import java.util.Scanner;

public class P152_CheckPowerOf4 {
    static void CheckPowerof4(int n) {
        int count = 0;
        if ((n & n - 1) == 0) {
            while (n > 0) {
                count++;
                if ((n & 1) == 1)
                    break;
                n = n >> 1;
            }
            System.out.println((count % 2 == 1) ? "It is Power of 4" : "It is Not a Power of 4");
        } else System.out.println("It is Not a Power of 4");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        CheckPowerof4(n);
    }
}
