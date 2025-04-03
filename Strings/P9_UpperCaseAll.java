package Strings;

public class P9_UpperCaseAll {
    static void Display(char[] ch) {
        for(int i=0; i<ch.length; i++)
            System.out.print(ch[i]);
        System.out.println();
    }
    static void UpperCase(char ch[]) {
         for(int i=0; i<ch.length; i++) {
            if(ch[i] > 96 && ch[i] < 123) 
                ch[i] = (char)(ch[i] - 32);
         }
    }

    static String StringPut(char ch[]) {
        String s = "";
        for(int i=0; i<ch.length; i++) 
            s += ch[i];
        
        return s;
    }
    public static void main(String[] args) {
        String str = "What is your name";
        char ch[] = str.toCharArray();
    
        Display(ch);
        
        UpperCase(ch);

        System.out.println(StringPut(ch));
    }
}
