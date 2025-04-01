package PatterCreation.Rough;

public class GenerateSequence1 {
    static void GenerateSequence1(int n) {
        for(int i=0; i<n; i++) System.out.print((i<n/2) ? i+" " : n-i-1+" ");
        
    }
    public static void main(String[] args) {
        int n = 9;
        GenerateSequence1(n);
    }
}
