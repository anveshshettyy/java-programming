package PatterCreation.Rough;

public class LengthOfNumber {
    static void LengthOfNumber(int n) {
        int count = 0;
        for(int i=n; i != 0; i /=10) count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        int n = 12345678;
        LengthOfNumber(n);
    }
}
