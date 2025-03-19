package NumberLogic;

import java.util.Scanner;

public class P105_Vowel {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);

    System.out.println((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'  ) ? "It is a Vowel" : "It is a Consonant"); 
}}
