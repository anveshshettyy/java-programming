package NumberLogic;

import java.util.Scanner;

public class P25_SunnyNumber {
    static void SunnyNumber(int n) {
        int flag = 0;
        for(int i=2; i<=n/2; i++) {
            if(i*i == n) {
                flag = 1;
                break;
            }
        }  
        System.out.println((flag == 1) ? "It is a Sunny Number" : "It is Not a Sunny Number");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        SunnyNumber(n+1);
    }
}
