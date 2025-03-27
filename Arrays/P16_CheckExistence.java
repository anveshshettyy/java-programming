package Arrays;

public class P16_CheckExistence {
    static int LinearSearch(int arr[], int n, int k) {
        int index = 0;
        for(int i=0; i<n; i++) {
            if(arr[i]==k) index++;
        }
        return (index == 0) ? 0 : 1;
    }
    public static void main(String[] args) {
        int[] arr = { 3, 6, 2, 9, 7, 1 };
        int k = 21, n = 6;

        System.out.println((LinearSearch(arr, n, k) == 0) ? "Not Present" : "Is Present");
    }
}
