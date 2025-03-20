package NumberLogic;

import java.util.Scanner;

public class P146_SmallestOfThree {
    public static void main(String[] args) {
        // int[] arr = { 12, 17, 22 };
        // int size = arr.length;
        // int min = arr[0];
        // for (int i = 0; i < size; i++) {
        //     if (arr[i] < min) {
        //         min = arr[i];
        //     }
        // }
        // System.out.println("Smallest is: " + min);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        System.out.println((a<b && a<c) ? a+" is smallest" : ((b<c) ? b+" is smallest" : c+" is smallest"));

    }
}
