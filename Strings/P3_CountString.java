package Strings;

public class P3_CountString {
    static void Display(char[] ch) {
        for(int i=0; i<ch.length; i++)
            System.out.print(ch[i]);
        System.out.println();
    }
    static void AddCount(char ch[], int start, int end) {
        // System.out.println(start+" "+end);
        int count = (end - start) + 1;
        ch[end] = (char)(count + 48);
    }
    static String StringPut(char ch[]) {
        StringBuilder res = new StringBuilder();
        for(int i=0; i<ch.length; i++) {
            res.append(ch[i]);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String str = "What is your name";
        char ch[] = str.toCharArray();
    
        Display(ch);
        
        int start = 0;
        for(int i=0; i<ch.length; i++) {
            if(ch[i] == ' ' || i == ch.length - 1) {
                int end = (i == ch.length - 1) ? i : i - 1;
                AddCount(ch, start, end);
                start = i + 1;
            }
        }
        System.out.println(StringPut(ch));
    }
}
