package PatterCreation.Exercise;

public class Pattern40 {
    public static void main(String[] args) {
        int n=11;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(!(i+j<=n/2 || i-j<=-n/2 || i+j >= 3*(n/2) || i-j>=n/2)) 
                if(i>5) {
                    System.out.print(n-i-1+" ");
                } else {
                    System.out.print(i+" ");
                }
                else 
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
