package TwoD_Array;

public class rowWise {
    public static void main(String[] args) {
        int n = 3, m = 4;
        int arr[][] = new int[n][m];
        int k = 1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                arr[i][j] = k++;
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
