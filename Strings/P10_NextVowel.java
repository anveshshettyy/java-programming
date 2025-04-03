package Strings;

public class P10_NextVowel {
    static void Display(char[] ch) {
        for(int i=0; i<ch.length; i++)
            System.out.print(ch[i]);
        System.out.println();
    }
    static void NextVowel(char ch[]) {
        char arr[] =  {'a', 'e', 'i', 'o', 'u'};
    
        for(int j=0; j<ch.length; j++) {
                for(int i=0; i<5; i++) {
                    if(ch[j] == arr[i]) {
                        ch[j] = (char)(arr[(i+1)%5] - 32);
                        break;
                    } 
                }
                 
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
        
        
        NextVowel(ch);

        System.out.println(StringPut(ch));
    }

}
