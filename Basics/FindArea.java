package Basics;

import java.util.Scanner;

class Area {
    public double Triangle(double h , double x) {
        double area = 0.5 * h * x;
        return area;
    }

    public float Square(float s) {
        float area = s * s;
        return area;
    }
    public float Rectangle(float l, float b) {
        float area = l * b;
        return area;
    }
}

public class FindArea {
    public static void main(String args[]) {
        Area obj = new Area();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height: ");
        float h = sc.nextFloat();

        System.out.println("Enter breadth: ");
        float b = sc.nextFloat();
        double triangleArea = obj.Triangle(h,b);

        System.out.println("Enter side: ");
        float a = sc.nextFloat();
        double SquareArea = obj.Square(a);

        System.out.print("Enter Length: ");
        float l = sc.nextFloat();
        
        System.out.print("Enter Breadth: ");
        float bb = sc.nextFloat();

        double rectangleArea = obj.Rectangle(l, bb);


        System.out.println("Area of Triangle is: "+triangleArea);
        System.out.println("Area of Square is: "+SquareArea);
        System.out.println("Area of Rectangle is: "+rectangleArea);


        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Height: ");
        // float h = sc.nextFloat();
        // System.out.println("Enter Base: ");
        // float B = sc.nextFloat();
        // double triangle = (0.5 * h * B);
        // System.out.println("Area of Triangle is: "+triangle);

        // System.out.println("Enter length: ");
        // float l = sc.nextFloat();
        // System.out.println("Enter Breadth: ");
        // float b = sc.nextFloat();
        // double rectangle = (l * b);
        // System.out.println("Area of Rectangle is: "+rectangle);

        // System.out.println("Enter Side: ");
        // float s = sc.nextFloat();
        // double Rectangle= (s * s);
        // System.out.println("Area of Square is: "+square);

    }
}
