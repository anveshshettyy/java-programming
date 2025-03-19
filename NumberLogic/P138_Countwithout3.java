package NumberLogic;

import java.util.Scanner;

public class P138_Countwithout3 {
    static int CountWithout3(int n) {
        int flag = 0;
        while(n>0){
            int rem = n % 10;
            if(rem == 3) {
                flag = 1;
                break;
            }
            n /= 10;
        }
        return ((flag == 1) ? 0 : 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            int res = CountWithout3(i);
            if (res != 0) 
                count++;
        }
        System.out.println(count);
    }
}
