package Strings;

public class P4_ReplaceSymbol {
        static void Display(char[] ch) {
            for(int i=0; i<ch.length; i++)
                System.out.print(ch[i]);
            System.out.println();
        }
        static void ReplaceSymbol(char ch[], int start, int end) {
            ch[start] = '@';
            ch[end] = '#';
        }
        public static void main(String[] args) {
            String str = "What is your name";
            char ch[] = str.toCharArray();
        
            Display(ch);
            
            int start = 0;
            for(int i=0; i<ch.length; i++) {
                if(ch[i] == ' ' || i == ch.length - 1) {
                    int end = (i == ch.length - 1) ? i : i - 1;
                    ReplaceSymbol(ch, start, end);
                    start = i + 1;
                }
            }
        
            Display(ch);
    }
}
