package NumberLogic;

import java.util.Scanner;

public class P100_HammingNumber {
    static int isHammingNumber(int n) {
        int temp = n;
        while (n%2 == 0 ) n /= 2;
        while (n%3 == 0 ) n /= 3;
        while (n%5 == 0 ) n /= 5;
        
        return ((n == 1) ? temp  :  0);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int x = n;
        int i = 1;
        while(x>0) {
            int res = isHammingNumber(i);
            if(res != 0) {
                System.out.print(res+" ");
                x--;
            }
            i++;
        }
        
    }
}
