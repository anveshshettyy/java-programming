package Strings;

public class MaximumWord {
    public static void main(String[] args) {
        String s = "Hello there abcd efgh ehhh, How are you? Iam fine.";

        int len = 0, maxLen = 0;
        String[] arr = s.split(" ");

        for(String str: arr) {
            char c = str.charAt(str.length()-1);
            len = ( c == '.' || c == ',' || c == '?') ? 0 : len+1;
            maxLen = Math.max(maxLen, len);
        } 
        System.out.println(maxLen+1);
    }
}
