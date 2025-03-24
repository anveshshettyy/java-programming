package PatterCreation.Exercise;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print((i-j >= 0 ) ? i + j*1+"  " : "   ");
            }
            System.out.println();
        }
    }
}
