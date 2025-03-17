package NumberLogic;

import java.util.Scanner;

public class P92_CubeorNot {
    static void isCube(int n) {
        int flag = 0;
        for(int i=0; i<n; i++) {
            if(i*i*i == n) {
                flag = 1;
                break;
            }
        }
        System.out.println((flag==1) ? "It is a Cube" : "Not a Cube");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        isCube(num);
        
    }
}
