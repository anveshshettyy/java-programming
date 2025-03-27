package Arrays;

import java.util.HashSet;

public class P25_UnionOf2Arrays {
    static int[] Union(int[] nums1, int[] nums2) {
        HashSet <Integer> hs = new HashSet<>();

        for(int nums: nums1) {
            hs.add(nums);
        }

        for(int nums: nums2) {
            hs.add(nums);
        }

        int size = 0;
        for(int nums: hs) {
            size++;
        }

        int res[] = new int[size];
        int j=0;
        for(int nums:hs) {
            res[j] = nums;
            j++;
        }
        return res;

    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8,9,10,2};
        int arr2[] = {2,3,4,4,5,11,12};

        int res[] = Union(arr1, arr2);

        for(int nums: res) {
            System.out.print(nums+" ");
        }

        
    }
}
