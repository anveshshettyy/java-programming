package Strings;

public class P14_RemoveSpacenSort {
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
        sortString(ch);
        str = "";
        for(char c:ch) 
            str += c;
        System.out.print(str.trim());
    }
}
