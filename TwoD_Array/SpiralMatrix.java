package TwoD_Array;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        ArrayList<Integer> list = new ArrayList<>();
        int top = 0, left = 0;
        int bottom = mat.length, right = mat[0].length;

        while (left < right && top < bottom) {
            for (int i = left; i < right; i++) {
                list.add(mat[top][i]);
            }

            top++;

            for (int i = top; i < bottom; i++) {
                list.add(mat[i][right - 1]);
            }

            right--;

            if (top < bottom) {
                for (int i = right - 1; i >= left; i--) {
                    list.add(mat[bottom - 1][i]);
                }
                bottom--;
            }

            
            if (left < right) {
                for (int i = bottom - 1; i >= top; i--) {
                    list.add(mat[i][left]);
                }
                left++;
            }

            
        }

        System.out.println(list);

    }
}
