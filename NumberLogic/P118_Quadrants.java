package NumberLogic;

import java.util.Scanner;

public class P118_Quadrants {
    static int isPositveNegative(int n){
        return (n>=0) ? 1 : 0;
    }
    static void Quadrant(int res1, int res2) {
        if(res1 == 1 && res2 == 1) {
            System.out.println("Quadrant I");
        } else if (res1 == 0 && res2 == 1) {
            System.out.println("Quadrant II");
        } else if (res1 == 0 && res2 == 0) {
            System.out.println("Quadrant III");
        } else {
            System.out.println("Quadrant IV");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        int res1 = isPositveNegative(x);
        int res2 = isPositveNegative(y);

        Quadrant(res1, res2);
    }   
}
