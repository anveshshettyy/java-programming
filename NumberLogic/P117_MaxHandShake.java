package NumberLogic;

import java.util.Scanner;

public class P117_MaxHandShake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int maxHandShake = ((n-1)*n)/2;
        System.out.println(maxHandShake);
    }
}
