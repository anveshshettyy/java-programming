package NumberLogic;

import java.util.Scanner;

public class P83_CatalanNumber {
    static int Catalan(int n) {
        if(n <= 1) return 1;
        int res = 0;
        for(int i=0; i<n; i++) {
            res += Catalan(i) * Catalan(n-1-i);
        }
        return res;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Catalan Numbers are: ");
        int i=0;
        while(n>0) {
            int res = Catalan(i);
            if(res != 1) {
                System.out.print(res+" ");
                n--;
            } 
            i++;
        }
    }
}
