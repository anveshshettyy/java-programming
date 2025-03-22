package NumberLogic;

import java.util.Scanner;

public class P172_PositionofOnlySetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int temp = n,count1 = 0, count2 = 0;
        while(temp>0) {
            count1++;
            if((temp&1) == 1) {
                count2++;
            }
            temp = temp>>1;
        }
        System.out.println((count2 == 1) ? count1 : -1); 
    }
}
