package Strings;

public class P15_SortWord {
    static void sortString(char ch[]) {
        for(int i=0; i<ch.length - 1; i++) {
            for(int j=0; j<ch.length; j++) {
                if((char)(ch[i]) < (char)(ch[j])) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        String str = "what is your name";
        char ch[] = str.toCharArray();
        int start = 0;
        for(int i=0; i<ch.length; i++) {
            if(ch[i] == ' ' || i == ch.length -1) {
                
            }
        }
        
    }
}
