package PatterCreation.Exercise;

public class Patttern83 {
    public static void main(String[] args) {
        int n=5;
       
        for(int i=0;i<n;i++){
            for(int k=0; k<5; k++) {
                for(int j=0;j<2*n;j++){
                    if(i+j==n-1)
                        System.out.print("/");
                    else if(i-j == -n) 
                        System.out.print("\\");
                    else
                        System.out.print(" ");
                }
                // System.out.println();
            }
            System.out.println();

        }
    }
}
