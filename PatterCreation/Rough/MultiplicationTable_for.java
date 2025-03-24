package PatterCreation.Rough;

public class MultiplicationTable_for {
    static void MultiplicationTable(int n) {
        for(int i=n; i<= n*10; i+= n) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int n = 25;
        MultiplicationTable(n);
    }
}
