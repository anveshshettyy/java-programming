package BitManipulation;

import java.util.Scanner;

public class RemoveLastSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int res = n;
        int temp = 0;
        int i=0;
        while(n>0) {
            temp = 1<<i;
            if((res & 1) == 1) {
                res = res & temp;
                break;
            }
            res = n >> 1;
            n = n >> 1;
            i++;
        } 
        System.out.println(temp);
    }
}
