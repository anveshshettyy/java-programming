package PatterCreation.Exercise;

public class Pattern14 {
    public static void main(String[] args) {
        int n = 9;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(!(i+j<=n/2 || i-j<=-n/2 || i+j >= 3*(n/2) || i-j>=n/2  ) ? (char)(70-j)+" ": "  ");
            }
            
            System.out.println();
        }
    }
}
