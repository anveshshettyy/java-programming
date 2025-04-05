package Strings;

public class P16_Frequency {
    static void CalculateFrequency(char ch[]) {
        int arr[] = new int[ch.length];
        for(int i=0; i<ch.length; i++) {
            arr[i] = 1;
            for(int j=i+1; j<ch.length; j++) {
                if(ch[i] == ch[j]) {
                    arr[i] = arr[i]+1;
                    ch[j] = '&';
                } 
            }
        }

        // int k = 0;
        // int res[] = new int[ch.length];
        // for(int i=0; i<ch.length; i++) {
        //     if(ch[i] != '&') {
        //         res[k] = arr[i];
        //         k++;
        //     }
        // }

        String str = "";
        for(int i=0; i<ch.length; i++) {
            if(ch[i] != '&') {
                str += arr[i];
                str += " ";
            }
        }

        System.out.println(str);

        // for(char i:ch) System.out.print(i+" ");
        // System.out.println();
        // for(int i:res) System.out.print(+i+" ");
        // for(int i=0; i<ch.length; i++) {
        //     if(res[i] != 0) {
        //         System.out.print(res[i]+" ");
        //     }
        // }
    } 
    public static void main(String[] args) {
        String str = "what is your name";

        System.out.println(str);

        char ch[] = str.toCharArray();

        CalculateFrequency(ch);
    }
}
