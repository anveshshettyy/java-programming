package Recursion;

public class Basic {
    static int i;
    static void Sequence(int i) {
        if(i<5) {
            System.out.print(i+" ");
            Sequence(i+1);
        }
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        Sequence(i);
    }
}
