package PatterCreation.Rough;

public class GenerateSequence2 {
    static int i;
    static void GenerateSequence(int range) {
        if(range<4) {
            System.out.print(range+" ");
            GenerateSequence(range+1);
        }
        System.out.print(range+" ");
    }
    public static void main(String[] args) {
        GenerateSequence(i);
    }
}
