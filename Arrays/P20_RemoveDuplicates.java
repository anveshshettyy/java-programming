package Arrays;

import java.util.HashSet;

public class P20_RemoveDuplicates {
    static void RemoveDuplicates(int arr[]) {
        HashSet<Integer> hs = new HashSet<>();

        for(int nums:arr) {
            hs.add(nums);
        }
        // System.out.println(hs);
        for(int nums:hs) {
            System.out.print((nums+" "));
        }
    }
    public static void main(String[] args) {
        int[] arr = { 3, 6, 2, 9, 8, 2, 3 };    
        
        RemoveDuplicates(arr);
    }
}
