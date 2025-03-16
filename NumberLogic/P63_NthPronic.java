package NumberLogic;

import java.util.Scanner;

public class P63_NthPronic {
    static int PronicNumber(int n) {
        int flag = 0;
        for(int i=1; i<=n/2; i++) {
            if((i * (i+1)) == n) {
                flag = 1;
                break;
            }
        }
        return ((flag == 1 || n == 0) ? n : -1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Pronic Number is: ");
        int res = 0, i = 0;
        while(n>0) {
            res = PronicNumber(i);
            if(res != -1) 
                n--;
            i++;
        }
        System.out.println(res);
    }
}
