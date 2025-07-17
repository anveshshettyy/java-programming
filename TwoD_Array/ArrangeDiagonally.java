package TwoD_Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrangeDiagonally {
    public static void main(String[] args) {
        int matrix[][] = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};

        int row = matrix.length, col = matrix[0].length;

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=row-1; i >= 0; i--) {
            ArrayList<Integer> list = new ArrayList<>();
            int temp = i;
            int j = 0;
            while(temp < row && j < col) {
                list.add(matrix[temp][j]);
                temp++;
                j++;
            }
            Collections.sort(list);
            temp = i;
            j = 0;
            int k = 0;
            while(temp < row && j < col) {
                matrix[temp][j] = list.get(k++);
                temp++;
                j++;
            }

            System.out.println(list);
        }

        for(int i=col-1; i> 0; i--) {
            ArrayList<Integer> list = new ArrayList<>();
            int temp = i;
            int j = 0;
            while(temp < col && j < row) {
                list.add(matrix[j][temp]);
                temp++;
                j++;
            }
            Collections.sort(list);

            temp = i;
            j = 0;
            int k = 0;
            while(temp < col && j < row) {
                matrix[j][temp] = list.get(k++);
                temp++;
                j++;
            }
            System.out.println(list);
        }

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
