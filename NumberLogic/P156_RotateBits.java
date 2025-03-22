package NumberLogic;

import java.util.Scanner;

public class P156_RotateBits {
    static void Rotate(int num,int n) {
        int t = 32;
        int left = ((num<<n) | num>>(t-n));
        int right = ((num>>n) | num<<(t-n));

        System.out.println("Left Rotation: "+left);
        System.out.println("Right Rotation: "+right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num to Rotate: ");
        int num = sc.nextInt();
        
        System.out.print("Enter Num of Rotations: ");
        int n = sc.nextInt();
        Rotate(num, n);
    }
}
