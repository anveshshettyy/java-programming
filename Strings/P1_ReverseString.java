package Strings;

public class P1_ReverseString {
    static void reverse(char ch[]) {
        int i=0, j=ch.length-1;
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

        reverse(ch);

        Display(ch);
    }
}
