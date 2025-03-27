package HashMap;

import java.util.HashMap;

public class Frequency {
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    int[] arr = {1,2,2,3,4};

    int count = 0;

    for(int i:arr) {
        hashMap.put(i,count++);
        if(hashMap.get(i)) {
            System.out.println(count);
        }
    }
}
