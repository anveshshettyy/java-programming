package PatterCreation.Exercise;

public class Pattern10 {
    public static void main(String[] args) {
        int n = 9, k=0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print((i-j>=0 && j<=n/2  && i+j <= n-1 && j<=n/2) ? j+1+"  " : "  ");
            }
            
            System.out.println();
        }
    }
}
