package TwoD_Array;

import java.util.Scanner;

public class MaxOfRowNCol {
    public static void main(String[] args) {
        int nums[][] = {
                       {5, 4, 3, 1, 6},
                       {6, 8, 4, 5, 2},
                       {8, 6, 2, 4, 9},
                       {5, 3, 7, 5, 9},
                       {1, 4, 2, 6, 8}};
        

        int rowMax = 0, colMax = 0;
        // for(int i=0; i<nums.length; i++) {
        //     colMax = 0;
        //     for(int j=0; j<nums[0].length; j++) {
        //         colMax = Math.max(colMax, nums[i][j]);
        //     }
        //     System.out.print(colMax+" ");
        // }

        for(int i=0; i<nums[0].length; i++) {
            rowMax = 0;
            for(int j=0; j<nums.length; j++) {
                rowMax = Math.max(nums[j][i], rowMax);
            }
            System.out.print(rowMax+" ");
        }

        System.out.println();
        System.out.println("----------");

        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums[0].length; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
