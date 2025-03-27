package Arrays;


public class P23_MoveZeroesToEnd {
    static void MoveZeroesToEnd(int arr[]) {
        int j = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            } 
        }

        for( int i = j; i<arr.length; i++) {
            arr[i] = 0;
        }
        // return arr;
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 0, 5};

        MoveZeroesToEnd(arr);
        for(int nums: arr) {
            System.out.print(nums+" ");
        }
    }
}
