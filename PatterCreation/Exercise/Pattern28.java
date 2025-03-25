package PatterCreation.Exercise;

public class Pattern28 {
    public static void main(String[] args) {
        int n = 9;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print((j==n/2 && i== n/2) ? "0 " : "* ");
            }
            System.out.println();
        }
    }
}
