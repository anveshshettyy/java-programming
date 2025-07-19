package Strings;

public class ToggleCase {
    public static void main(String[] args) {
        String s = "GHxyzD";
        String res = "";

        for(int i=0; i<s.length(); i++) {
            char c =s.charAt(i);
            res += (char)(c^32);
        }

        System.out.println(res);
    }
}
