package Strings;

public class P20 {
    public static void main(String[] args) {
        int arr[] = {-2,-2,2,2};
        int n = 4;
        
        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(arr[i] + arr[j] == 0 && i < j) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
