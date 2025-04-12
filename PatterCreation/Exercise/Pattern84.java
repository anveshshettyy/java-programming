package PatterCreation.Exercise;

public class Pattern84 {
    public static void main(String[] args) {
        int n=15;
       
        for(int i=0;i<=n/2;i++){
            for(int k=0; k<5; k++) {
                for(int j=0;j<n;j++){
                    if(i+j==n/2 || i-j == -n/2) {
                        System.out.print(n*k +j+1);
                    } 
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
