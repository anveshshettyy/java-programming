package PatterCreation.Exercise;

public class Pattern53 {
    public static void main(String[] args) {
        int n=10 ;
        for(int i=0;i<=n;i++){
            for(int j=1;j<n;j++){
                if( i-j==n/2 || i+j==3*n/2 )
                    System.out.print((char)('A'+n-i)+" ");
                else   
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
