package Arrays;

public class P21_MissingNumber {
    static int MissingNumber(int arr[]) {
        int n = arr.length;
        int totalSum = (n* (n+1)) / 2;
        int sum = 0;
        for(int nums:arr)  sum += nums;
        return (totalSum - sum);
    }
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2 };
        
        System.out.println(MissingNumber(arr));
        
    }
}
