package Strings;

import java.util.HashSet;

public class NonRepeatingString {
    public static void main(String[] args) {
        String s = "abcabcbb";

        HashSet<Character> set = new HashSet<>();
        int l = 0, r = 0, maxLen = 0;
        while(r < s.length()) {
            char c = s.charAt(r);
            if(!set.contains(c)) {
                maxLen = Math.max(maxLen, r - l + 1);
                set.add(c);
                r++;
            } else {
                set.remove(c);
                l++;
            }
        }

        System.out.println(maxLen);
    }
}
