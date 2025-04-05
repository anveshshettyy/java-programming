package Strings;

public class P18_RemoveDuplicates {
    static void Display(char[] ch) {
        for(int i=0; i<ch.length; i++)
            System.out.print(ch[i]);
        System.out.println();
    }
    static void RemoveDuplicates(char ch[]) {
        int arr[] = new int[ch.length];
        for(int j=0; j<ch.length; j++) {
            arr[j] = (int)(ch[j]);
        }

        for(int i:arr) System.out.print(i+" ");
    }   
    static String StringPut(char ch[]) {
        String s = "";
        for(int i=0; i<ch.length; i++)
            s += ch[i];
        return s;
    }
    public static void main(String[] args) {
        String str = "what is your name";
        char ch[] = str.toCharArray();
    
        Display(ch);
        
        
        RemoveDuplicates(ch);

        System.out.println(StringPut(ch));
    }
}
