package PatterCreation.Rough;

public class ReverseSequence {
    static void ReverseSequence(int n) {
        for(int i=n; i>=0; i--) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int n = 4;
        ReverseSequence(n);
    }
}
