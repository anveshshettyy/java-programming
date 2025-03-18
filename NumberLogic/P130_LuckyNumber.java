package NumberLogic;

import java.util.Scanner;

public class P130_LuckyNumber {
    static void LuckyNumber(int start, int end,int num) {
        int count = 0, flag = 0;
        for(int i=start; i<=end; i= i+2) {
            count++;
            if(count == 3) {
                count = 0;
                continue;
            }
            if(i==num) 
                flag = 1;
        }
        System.out.println((flag == 1) ? "It is a Lucky Number" : "It is Not a Lucky Number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int start = 1;
        int end = n+10;   
        
        LuckyNumber(start, end, n);

    }
}
