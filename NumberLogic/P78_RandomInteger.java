package NumberLogic;

import java.util.Random;
import java.util.Scanner;

public class P78_RandomInteger {
    static void RandomNums(int min, int max, int count) {
        Random rand = new Random();
        for(int i=0; i<count; i++) {
            System.out.print((rand.nextInt(max - min + 1) + min)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Min: ");
        int min = sc.nextInt();
        System.out.print("Enter Max: ");
        int max = sc.nextInt();
        System.out.print("Enter Count: ");
        int count = sc.nextInt();

        RandomNums(min, max, count);
    }
}
