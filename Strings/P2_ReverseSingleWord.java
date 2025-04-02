package Strings;

public class P2_ReverseSingleWord {
    static void reverse(char ch[], int start, int end) {
        int i=start, j=end;
        while(i<=j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;j--;
        }
    }
    static void Display(char[] ch) {
        for(int i=0; i<ch.length; i++)
            System.out.print(ch[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "What is your name";
        char ch[] = str.toCharArray();

        Display(ch);

        int start = 0;
        for(int i=0; i<ch.length; i++) {
            if(ch[i] == ' ' || i == ch.length - 1) {
                int end = i-1;
                reverse(ch,start, end);
                start = i+1;
            }
        }

        Display(ch);
    }
}
