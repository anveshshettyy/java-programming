package PatterCreation.Exercise;

public class Pattern33 {
    public static void main(String[] args) {
        int n = 6;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print((i-j<=0 ) ? "* " : " ");
            }
            System.out.println();
        }
    }
}
