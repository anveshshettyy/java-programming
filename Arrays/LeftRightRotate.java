package Arrays;

public class LeftRightRotate {
    static void RightRotate(int[] arr, int n) {
        int temp = arr[n-1]; 


        for(int i=n-1; i>0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void LeftRotate(int[] arr, int n) {
        int temp = arr[0]; 
        for(int i=1; i<n; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;

        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {3, 6, 2, 9, 7, 4};

        LeftRotate(arr, n);
        RightRotate(arr, n);
    }
}
