package TwoD_Array;

public class columnWise {
    public static void main(String[] args) {
        int n = 4, m = 3;
        int arr[][] = new int[n][m];
        int k = 1;

        for(int i=0;i<n; i++) {
            for(int j=0; j<m;j++) {
                arr[i][j] = k++;
            }
        }
    
        for(int i=0;i<m; i++) {
            for(int j=0; j<n;j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
