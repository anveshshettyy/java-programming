package TwoD_Array;

public class KnapSack {
    public static void main(String[] args) {
        // int values[] = {2, 3, 4, 1};
        // int weights[] = {3, 4, 5, 6};

        int values[] = {4, 1, 5, 7};
        int weights[] = {3, 2, 4, 5};

        // int W = 8;
        int W = 7 ;

        int n = values.length;

        int grid[][] = new int[n+1][W+1];

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=W; j++) {
                if(weights[i-1] > j) {
                    grid[i][j] = grid[i-1][j];
                } else {
                    int maxVal = Math.max(grid[i-1][j], (values[i-1] + grid[i-1][j - weights[i-1]]));
                    grid[i][j] = maxVal;
                }
            }
        }

        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Result: "+grid[n][W]);
    }
}
