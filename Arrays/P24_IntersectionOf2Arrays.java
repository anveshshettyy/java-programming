package Arrays;

import java.util.HashSet;

public class P24_IntersectionOf2Arrays {
    static int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> hs1 = new HashSet<>();
        HashSet <Integer> hs2 = new HashSet<>();
        for(int nums: nums1) 
            hs1.add(nums);
        
        int j=0, size = 0;
        for(int nums: nums2) {
            if(hs2.contains(nums)) continue;
            if(hs1.contains(nums)) {
                hs2.add(nums);
                size++;
            }
        }

        int res[] = new int[size];
        for(int nums: hs2) {
            res[j] = nums;
            j++;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,2,1};
        int arr2[] = {2,2};

        int res[] = intersection(arr1, arr2);

        for(int nums: res)  System.out.print(nums+" ");
        
    }
}
