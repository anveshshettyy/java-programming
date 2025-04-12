package PatterCreation.Exercise;

public class Pattern82 {
    public static void main(String[] args) {
        int n=9;
       
        for(int i=0;i<n;i++){
            for(int k=0; k<3; k++) {
                for(int j=0;j<2*n+1;j++){
                    if(j<n &&(i==0 || i==n/2 || i==n-1||
                       j==0 && i<=n/2 ||
                       j==n-1 && i>=n/2) ||
                       j==n+1 || j>n && (i+j==n+n/2+1 ||
                       i-j==-7))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                // System.out.println();
            }
            System.out.println();

        }
    }
}
