package Recursion;

public class ReverseNumber {
    static void Reverse(int n) {
        if(n!=0) {
            System.out.print(n%10 +" ");
            Reverse(n/10);
        } 
    }
    public static void main(String[] args) {
        int n = 1011;
        Reverse(n);
    }
}
