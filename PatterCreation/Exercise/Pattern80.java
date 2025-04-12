package PatterCreation.Exercise;

public class Pattern80 {
    public static void main(String[] args) {
        int n = 11;
        for(int i=0; i<2*n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print((i-j == 0 || i+j == 2*n-2) ? "*" : " ");
            }
            System.out.println();
        }
    }
}
