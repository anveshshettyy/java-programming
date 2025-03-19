package BitManipulation;

import java.util.Scanner;

public class Clear_ithBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter i: ");
        int i = sc.nextInt();
        
        int res = n;
        // int temp = 0;
        // temp = 1<<i;

        if(((res>>i) & 1 ) == 1) res = n ^ 1<<i;

        System.out.println(res);
    }
}
