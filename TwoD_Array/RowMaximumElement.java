package TwoD_Array;

public class RowMaximumElement {
    public static void main(String[] args) {
        int n = 3, m = 4;
        int arr[][] = new int[n][m];
        int k = 1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                arr[i][j] = k++;
            }
        }
        
        int max = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                max = Math.max(max, arr[i][j]);
            }
            System.out.print(max+" ");
            // max = 0;
        }

        // for(int i=0; i<n; i++) {
        //     for(int j=0; j<m; j++) {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
}
