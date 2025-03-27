package HashMap;

import java.util.*;

public class Basic {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("John", 25);
        hashMap.put("Jane", 30);
        hashMap.put("Jim", 35);
        hashMap.put("John", 40);

        System.out.println(hashMap.get("John"));


    }
}
