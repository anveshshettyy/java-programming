package Recursion;

public class ReverseArray {
    static int i;
    static void Reverse(int nums[], int n) {
        if(i < n) {
            System.out.print(nums[n-(++i)]+" ");
            Reverse(nums, n);   
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        Reverse(arr, n);
    }
}
