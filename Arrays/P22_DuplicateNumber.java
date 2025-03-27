package Arrays;

import java.util.HashSet;

public class P22_DuplicateNumber {
    static int DuplicateNumber(int arr[]) {
        HashSet <Integer> hs = new HashSet<>();

        for(int nums: arr) {
            if(hs.contains(nums)) 
                return nums;
            hs.add(nums);
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,2, 3 ,4 , 3, 5};

        System.out.println(DuplicateNumber(arr));
    }
}
