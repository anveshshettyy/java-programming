package Strings;

import java.util.Scanner;

public class P19_Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char ch[] = s.toCharArray();

        for(int i=0; i<ch.length-1; i+=2) {
            // char temp = ch[i];
            ch[i] = ch[i+1];
            ch[i+1] = ch[i];
        }

        String res = "";

        for(char i:ch) {
            res += i;
        }

        System.out.println(res);

        // int a = 1, b =2 , c = 3;
        // System.out.println(a&b&c);
    }
}
