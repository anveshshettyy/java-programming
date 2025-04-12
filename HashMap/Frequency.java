package HashMap;

import java.util.HashMap;

public class Frequency { 
    public static void main(String[] args) {
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        String str = "wqdqwdq";
        for(int i= 0; i<str.length(); i++) {
            if(hashMap.containsKey(str.charAt(i))) {
                int n = hashMap.get(str.charAt(i)) + 1;
                hashMap.put(str.charAt(i), n);
            } else {
                hashMap.put(str.charAt(i), 1);
            }
        }

        System.out.println(hashMap);
    }
    
}
