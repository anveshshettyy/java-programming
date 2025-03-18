package NumberLogic;

import java.util.Scanner;

public class P108_AreaofCircle {
    static double Area(int r) {
        double pi = 3.14159265359;
        return (pi * pi * r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius");
        int radius = sc.nextInt();

        double area = Area(radius);
        System.out.println(area);
    }
}
