package Strings;

public class P6_EvenPositionCount {
    static void Display(char[] ch) {
        for(int i=0; i<ch.length; i++)
            System.out.print(ch[i]);
        System.out.println();
    }
    static void EvenCount(char ch[], int start, int end, int i) {
        // System.out.println(start+" "+end+" "+i);
        // int count = (end - start) + 1;
        int k = 1;
        for(int j=start; j<=end; j++) {
            if(k%2 == 0) ch[j] = (char)(k + 48);
            k++;
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
        
        int start = 0;
        for(int i=0; i<ch.length; i++) {
            if(ch[i] == ' ' || i == ch.length - 1) {
                int k = (start%2 == 0) ? 0 : 1 ;
                int end = (i == ch.length - 1) ? i : i - 1;
                EvenCount(ch, start, end, k);
                start = i + 1;
            }
        }

        System.out.println(StringPut(ch));
        // Display(ch);
    }
}
