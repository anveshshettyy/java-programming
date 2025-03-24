package PatterCreation.Exercise;

public class Pattern18 {
    public static void main(String[] args) {
        int n = 7, k=0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print((i-j >= 0 && j<=n/2 && i+j<= n-1 && j<=n/2) ? n/2 -j+"  " : "   ");
            }
            
            System.out.println();
        }
    }
}
