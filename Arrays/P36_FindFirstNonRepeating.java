package Arrays;

import java.util.HashMap;

public class P36_FindFirstNonRepeating {
    public static void main(String[] args) {
        int nums[] = { 9, 4, 9, 6, 7, 4 };

        HashMap <Integer, Integer> hm = new HashMap<>();

        for(int i:nums) {
            if(hm.get(i) != null) {
                hm.put(i,hm.get(i)+1);
            }else {
                hm.put(i,1);
            }
        }

        for(int i:nums) {
            if(hm.get(i) == 1) {
                System.out.println(i);
                break;
            }   
        }
    }
}
