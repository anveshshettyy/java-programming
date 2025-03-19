package NumberLogic;

import java.util.Scanner;

public class P137_AverageOfStream {
    static void AverageOfStream (double[] arr, int n) {
        int j=1;
        double sum = 0;
        for(int i=0; i<n; i++) {
            sum += arr[i];
            double avg = sum / j++;
            System.out.println("Average of "+(j-1)+" numbers is "+avg +" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        
        int size = sc.nextInt();
        

        double arr[] = new double[size];

        System.out.print("Enter array Elements: ");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        int n = arr.length;
        AverageOfStream(arr, n);

        
    }
}
