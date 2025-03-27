package Arrays;

import java.util.HashMap;
import java.util.Map;

public class P31_Frequency {
    public static void main(String[] args) {
        int nums[] = {5,3,4,3,2,3,2};
        int n = nums.length;

        HashMap <Integer, Integer> hm = new HashMap<>();

        for(int i:nums) {
            if(hm.get(i) != null) {
                hm.put(i,hm.get(i)+1);
            }else {
                hm.put(i,1);
            }
        }

        for(Map.Entry<Integer, Integer> e : hm.entrySet()) {
            System.out.println("Frequency of "+e.getKey()+" is: "+e.getValue());
        }

        // hm.put(1,1);
        // System.out.println(hm.get(1)+1);
    }
}
