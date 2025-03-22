package NumberLogic;

import java.util.Scanner;

public class P99_KeithNumber {
    static void formSequence(int arr[], int k, int n, int sum) {
        int  flag = 0;

        arr[k] = sum;

        int j = 0;
        for(int i=k+1; sum<=n; i++) {
            sum = (sum + arr[i-1]) - arr[j];
            if(sum==n) {
                flag = 1;
            }
            arr[i] = sum;
            j++;
        }

        for(int i=0; i<=j+2; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println((flag==1) ? "It is a Keith Number" : "It is not a Keith Number");

    }
    static void KeithNumber(int n) {
        int temp = n, pow = 1, rev = 0,sum = 0, size = 0;
        while(temp>0) {
            size++;
            int rem = temp%10;
            rev = rev * 10 + rem;
            temp /= 10;
        }

        int[] arr = new int[1000];

        int i=0;
        while(rev > 0) {
            int rem = rev % 10;
            sum += rem;
            arr[i] = rem;
            rev /= 10;
            i++;
        }
        // for(int j=0; j<size; j++) {
        //     System.out.print(arr[j]+" ");
        // }

        formSequence(arr, size, n, sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        KeithNumber(n);
        // int res = KeithNumber(n);
        // System.out.println(res);
        
    }
}
