package PatterCreation.Exercise;

public class Pattern79 {
    public static void main(String[] args) {
        int n=9;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i <= n/4 && j>= 3*(n/4)) || (i <= n/2 && i>= n/4 + 1 && j>= n/2))
                    System.out.print("X ");
                else   
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
