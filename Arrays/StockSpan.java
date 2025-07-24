package Arrays;

public class StockSpan {
    public static void main(String[] args) {
        int arr[] = {100, 80, 60, 70, 60, 75, 85};
        int res[] = new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            res[i] = 1;
            for(int j=i-1; j>=0; j--) {
                if(arr[i] > arr[j]) {
                    res[i]++;
                }
            }
        }

        for(int num: res) {
            System.out.print(num+" ");
        }
    }
}
