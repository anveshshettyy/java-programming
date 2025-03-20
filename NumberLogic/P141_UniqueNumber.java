package NumberLogic;

public class P141_UniqueNumber {
    static void AppearOnce(int arr[]) {
        int size = arr.length;
        int count = 0, res = 0;
        for(int i=0; i<size; i++) {
            count = 0;
            for(int j=1; j<size; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count <= 1) {
                res = arr[i];
                System.out.println("Unique Element is: "+res);
            }
        }
    }
    public static void main(String[] args) {
    int[] arr = {1,5,6,2,2};

    AppearOnce(arr);
    }    
}
