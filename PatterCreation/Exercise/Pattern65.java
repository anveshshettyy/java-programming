package PatterCreation.Exercise;

public class Pattern65 {
    public static void main(String[] args) {
        int n=5 ;
        for(int i=0;i<n;i++){
            for(int j=0;j<=n;j++){
                if(  i+j==n-1)
                    System.out.print(i+1+" ");
                else if(i-j==0 ) 
                    System.out.print(n-i+" ");
                else   
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
