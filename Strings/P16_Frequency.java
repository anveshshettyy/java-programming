package Strings;

public class P16_Frequency {
    static void CalculateFrequency(char ch[]) {
        int arr[] = new int[ch.length];
        for(int i=0; i<ch.length; i++) {
            for(int j=i+1; j<ch.length; j++) {
                if(ch[i] == ch[j]) {
                    ch[]
                }
            }
        }
    }
    public static void main(String[] args) {
        String str = "what are your name";

        char ch[] = str.toCharArray();

        CalculateFreqeuency(ch);
    }
}
