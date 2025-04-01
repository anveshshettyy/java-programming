package Arrays;

public class P39_Sort {
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int n = arr.length;

        for(int i=1; i<n; i++) {
            int j = i;
            while(j>0 && arr[j] < arr[j-1] ) {
                int temp = arr[j-1];     
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for(int i:arr) System.out.print(i+" ");
    }
}
