package Recursion;

public class NSum {
    public static int sum(int n) {
        if(n==0) return 0;
        return sum(n-1) + n;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }
}