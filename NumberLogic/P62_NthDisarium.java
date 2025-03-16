package NumberLogic;

import java.util.Scanner;

public class P62_NthDisarium {
    static int DisariumNumber(int n) {
        int i=0, sum = 0, copy = n, temp1 = n;
        while( copy > 0 ) {
            copy /= 10;
            i++;
        }
        copy = n;
        while(n > 0) {
            int rem = n % 10;
            int temp = rem;
            for(int j=i; j>1; j--) rem = rem * temp;
            sum += rem;
            i--;
            n /= 10;
        }
        return (copy==sum ? temp1 : 0);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Disarium Number is: ");
        int res = 0, i = 0;
        while(n>0) {
            res = DisariumNumber(i);
            if(res != 0) 
                n--;
            i++;
        }
        System.out.println(res);
    }
}
