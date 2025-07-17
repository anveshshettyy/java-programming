package TwoD_Array;

public class ScoreAfterFlip {
    public static void flipRow(int[][] grid, int row) {
        for(int j=0; j<grid[0].length; j++) {
            grid[row][j] = grid[row][j] == 0 ? 1 : 0; 
        }
    }

    public static void flipCol(int[][] grid, int col) {
        for(int j=0; j<grid.length; j++) {
            grid[j][col] = grid[j][col] == 0 ? 1 : 0; 
        }
    }


    public static void main(String[] args) {
        int grid[][] = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-----------");

        // for(int i=0; i<grid.length; i++) {
        //     for(int j=0; j<grid[0].length; j++) {
        //         if(grid[i][0] == 0) {
        //             flipRow(grid, 0);
        //         }

        //     }
        // }

        for(int i=0; i<grid.length; i++) {
            if(grid[i][0] == 0) {
                flipRow(grid, 0);
            }
        }

        for(int j=0; j<grid[0].length; j++) {
            if(grid[0][j] == 0) {
                flipCol(grid, j);
            }
        }

        String binary = "";
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            binary = "";
            for (int j = 0; j < grid[0].length; j++) {
                binary = binary + String.valueOf(grid[i][j]);
            }
            // System.out.println(binary);
            int decimal = Integer.parseInt(binary, 2);
            sum += decimal;
            // System.out.println(decimal);
            
        }

            System.out.println(sum);


        // for (int i = 0; i < grid.length; i++) {
        //     for (int j = 0; j < grid[0].length; j++) {
        //         System.out.print(grid[i][j] + " ");
        //     }
        //     System.out.println();
        // }


    }
}
