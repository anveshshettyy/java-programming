package Arrays;

public class P27_CheckIsSorted {
    static void CheckIsSorted(int arr[]) {
        int flag = 0;
        for(int i=1; i<arr.length; i++) {
            if(arr[i-1] > arr[i]) {
                flag = 1;
                break;
            }
        }
        System.out.println((flag == 1) ? "It is not sorted" : "It is sorted");
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        
        CheckIsSorted(arr);
    }
}
