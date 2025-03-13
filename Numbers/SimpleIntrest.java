package Numbers;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        float p = sc.nextInt();
        
        System.out.print("Enter Time: ");
        float t = sc.nextInt();

        System.out.print("Enter Rate of Intrest: ");
        float r = sc.nextInt();

        System.out.println("Enter Rate of Intrest: "+((p*t*r)/100));
        
    }
}
