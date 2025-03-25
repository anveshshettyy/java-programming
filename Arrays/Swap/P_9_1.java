package Arrays.Swap;


public class P_9_1 {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {3, 6, 2, 9, 7, 4};
        int res[] = new int[6];

        int j = 0;
        for(int i=0; i<n; i++) {
            if(i % 2 == 0) {
                res[j] = arr[i];
                j++;
            } 
        }

        for(int i=0; i<n; i++) {
            if(i % 2 != 0) {
                res[j] = arr[i];
                j++;
            } 
        }
        for(int i=0; i<n; i++) System.out.print(res[i]+"  ");
        
    }
}
