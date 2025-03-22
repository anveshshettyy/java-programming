package NumberLogic;

import java.util.Scanner;

public class P154_ModulusDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter m: ");
        int m = sc.nextInt();

        int temp = n^m;
        System.out.println(temp);
        
    }
}
