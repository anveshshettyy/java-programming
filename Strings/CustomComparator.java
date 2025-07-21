package Strings;

import java.util.*;

public class CustomComparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("kiwi", "apple", "grape", "banana");

        // Collections.sort(list, new Comparator<String>() {
        // public int compare(String s1, String s2) {
        // return s1.charAt(s1.length()-1) - s2.charAt(s2.length()-1);
        // }
        // });

        Collections.sort(list, new Comparator<String>() {
            public int countOvels(String s) {
                int count = 0;
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        count++;
                    }
                }
                return count;
            }

            public int compare(String s1, String s2) {
                return countOvels(s1) - countOvels(s2);
            }
        });

        System.out.println(list);

        // Collections.sort(list, new Comparator<String>() {
        // public int compare(String s1, String s2) {
        // return s1.length() - s2.length();
        // }
        // });

        // List <Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Collections.sort(list, new Comparator<Integer>() {
        // public int countOnes(int n) {
        // int c = 0;
        // while(n > 0) {
        // if((n&1) == 1)
        // c++;
        // n = n>>1;
        // }
        // return c;
        // }
        // public int compare(Integer a, Integer b) {
        // int countOnesA = countOnes(a);
        // int countOnesB = countOnes(b);
        // return countOnesA - countOnesB;
        // }
        // });

        System.out.println(list);

    }
}
