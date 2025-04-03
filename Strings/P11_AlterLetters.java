package Strings;

public class P11_AlterLetters {
    static void Display(char[] ch) {
        for(int i=0; i<ch.length; i++)
            System.out.print(ch[i]);
        System.out.println();
    }

    static String ConvertToString(char[] ch) {
        String str = "";
        for(char i:ch)  str += i;
        return str;
    }

    static void AlterLetters(char ch[], int start, int end) {
        int index = 0;
        for(int i=start; i<=end; i++) {
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U'  ) {
                ch[i] = (char)(ch[i] - 32);
                index = i; break;
            }
        }

        for(int i=start; i<=end; i++) {
            if(i<index) ch[i] = (char)(ch[i] - 1);
            else if(i>index) ch[i] = (char)(ch[i] + 1);
        }
    }
    public static void main(String[] args) {
        String str = "what is your name";

        char ch[] = str.toCharArray();
        Display(ch);
        int start = 0;
        for(int i=0; i<ch.length; i++) {
            if(ch[i] == ' ' || i == ch.length -1) {
                int end = (i == ch.length-1) ? i : i-1;
                AlterLetters(ch, start, end);
                start = i + 1;
            }
        }
        System.out.println(ConvertToString(ch));
    }
}
