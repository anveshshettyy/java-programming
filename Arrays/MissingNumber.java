package Arrays;

import java.util.ArrayList;

public class MissingNumber {
    public static void main(String args[]) {
        // ArrayList <Integer> arr = new ArrayList<>();
        int arr[] = {1, 4, 2};
        int n = arr.length;

        int tsum = ((n+1)*(n+2)) / 2;
        int sum = 0;

        int l = 0, r = n-1;
        while( l < r ) {
            sum += arr[l] + arr[r];
            l++; r--;
        }

        if(n % 2 != 0) {
            sum += arr[l];
        }

        System.out.println("Result: "+(tsum-sum));
    }
}
