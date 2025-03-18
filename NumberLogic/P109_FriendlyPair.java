package NumberLogic;

import java.util.Scanner;

public class P109_FriendlyPair {
    static int FriendlyPair (int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            if(n%i == 0) 
                sum += i;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        int res1 = (FriendlyPair (a));
        System.out.println("Friendly Ratio: "+res1/a);

        System.out.print("Enter b: ");
        int b = sc.nextInt();
        
        int res2 = (FriendlyPair (b));
        System.out.println("Friendly Ratio: "+res2/b);

        System.out.println((res1/a == res2/b) ? "It is a Fiendly Pair " : "It is Not a Friendly Pair" );   
    }
}
