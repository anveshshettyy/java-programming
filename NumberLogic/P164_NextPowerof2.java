package NumberLogic;

import java.util.Scanner;

public class P164_NextPowerof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int count = 0;
        while(n>0) {
            count++;
            n = n>>1;
        }

        int temp = 0;
        temp = 1<<count;

        System.out.println(temp);
    }
}
