package TwoD_Array;

import java.util.Scanner;

public class MaxOfRowNCol {
    public static void main(String[] args) {
        int nums[][] = { {8, 4, 8, 7},
            {7, 4, 7, 7},
            {9, 4, 8, 7},
            {3, 3, 3, 3} };
        

        int rowMax = 0, colMax = 0;
        // for(int i=0; i<nums.length; i++) {
        //     colMax = 0;
        //     for(int j=0; j<nums[0].length; j++) {
        //         colMax = Math.max(colMax, nums[i][j]);
        //     }
        //     System.out.print(colMax+" ");
        // }

        // for(int i=0; i<nums[0].length; i++) {
        //     rowMax = 0;
        //     for(int j=0; j<nums.length; j++) {
        //         rowMax = Math.max(nums[j][i], rowMax);
        //     }
        //     System.out.print(rowMax+" ");
        // }

        // for(int j=0; j<nums.length; j++) {
        //     rowMax = Math.max(nums[2][j], rowMax);
        // }
        // System.out.println(rowMax);

        for(int i=0; i<nums.length; i++) {
            colMax = Math.max(nums[i][2], colMax);
        }
        System.out.println(colMax);


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
