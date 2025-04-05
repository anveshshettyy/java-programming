package Strings;

public class P12_MinimumLength {
    static char GetFirst(char ch[], int start, int end) {
        return ch[start];
    }
    static int MinimumLen(char ch[], int start, int end) {
        return end - start + 1;
    }
    public static void main(String[] args) {
        String str = "what are your name";

        char ch[] = str.toCharArray();

        int start = 0, min = 100;
        for(int i=0; i<ch.length; i++) {
            if(ch[i] == ' ' || i == ch.length -1) {
                int end = (i == ch.length-1) ? i : i-1;
                int size = MinimumLen(ch, start, end);
                min = Math.min(min, size);
                start = i + 1;
            }
        }

        String str1 = "";
        
        for(int j=0; j<min; j++) {
            start = 0;
            for(int i=0; i<ch.length; i++) {
                if(ch[i] == ' ' || i == ch.length -1) {
                    int end = (i == ch.length-1) ? i : i-1;
                    str1 += GetFirst(ch, start+j, end);
                    start = i + 1;
                }
            }
            str1 += " ";
        }

        System.out.println(str1);
        
    }
}
