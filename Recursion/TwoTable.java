package Recursion;

public class TwoTable {
    static void TwoTable1(int n) {
        if(n<11) {
            System.out.println(2+" x "+n+" = "+2*n);
            TwoTable1(++n);
        }
    }
    public static void main(String[] args) {
        TwoTable1(1);
    }
}
