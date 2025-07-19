package Strings;

public class SortString {
    public static void main(String[] args) {
        String s = "abcadab";
        String res = "";

        int hash[] = new int[26];
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            hash[c - 'a']++;
        }

        for(int i=0; i<26; i++) {
            while(hash[i] > 0) {
                res += (char)('a' + i);
                hash[i]--;
            }
        }

        System.out.print(res);

    }
}
