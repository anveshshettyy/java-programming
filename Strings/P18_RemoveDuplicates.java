package Strings;

public class P18_RemoveDuplicates {
    static void RemoveDuplicates(char ch[]) {
        char arr[] = new char[ch.length];
        for(int i=0; i<ch.length; i++) {
            for(int j=i+1; j<ch.length; j++) {
                if(ch[i] == ch[j]) {
                    ch[j] = '&';
                }
            }
        }

        int j=0;
        for(int i=0; i<ch.length; i++) {
            if(ch[i] == '&') continue;
            arr[j] = ch[i]; j++;
        }

        for(char i:arr) System.out.print(i+" ");
    }
    public static void main(String[] args) {
        String str = "what is your name";

        char ch[] = str.toCharArray();

        RemoveDuplicates(ch);
    }
}
