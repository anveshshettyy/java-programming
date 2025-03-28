package Arrays;

import java.util.HashMap;
import java.util.Map;

public class P34_CommonElemIn3 {
    public static void main(String[] args) {
        int nums1[] = {1,2,5,4};
        int nums2[] = {5,6,7,2};
        int nums3[] = {10,2,5,15};

        HashMap <Integer, Integer> hm = new HashMap<>();
        
        for(int i:nums1) {
            if(hm.get(i) != null) {
                hm.put(i,hm.get(i)+1);
            }else {
                hm.put(i,1);
            }
        }
        for(int i:nums2) {
            if(hm.get(i) != null) {
                hm.put(i,hm.get(i)+1);
            }else {
                hm.put(i,1);
            }
        }
        for(int i:nums3) {
            if(hm.get(i) != null) {
                hm.put(i,hm.get(i)+1);
            }else {
                hm.put(i,1);
            }
        }

        for(Map.Entry<Integer, Integer> e : hm.entrySet()) {
            if(e.getValue() > 2) {
                System.out.println("Common Element of 3 array is "+e.getKey());
            }
        }
    }
}
