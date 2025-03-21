package PatterCreation;

public class MultiplicationTable_while {
    static void MultiplicationTable(int n) {
        int i = 10, temp = n;
        while(i>0) {
            System.out.println(temp);
            temp += n;
            i--;
        }
    }
    public static void main(String[] args) {
        int n = 4;
        MultiplicationTable(n);
    }
}
