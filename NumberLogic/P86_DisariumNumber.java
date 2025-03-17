package NumberLogic;

import java.util.Scanner;

public class P86_DisariumNumber {
    static void DisariumNumber(int n) {
        int i=0, sum = 0, copy = n;
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
        System.out.println(copy==sum ? "It is a Disarium Number" : "It is Not a Disarium Number");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        DisariumNumber(n);
    }
}
