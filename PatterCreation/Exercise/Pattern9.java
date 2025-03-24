package PatterCreation.Exercise;

public class Pattern9 {
    public static void main(String[] args) {
        int n = 5, k=0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i-j >=0) {
                    k++;
                    System.out.print(k+" ");
                }
                if(k>=9) k = 0;
                System.out.print("  ");
            }
            
            System.out.println();
        }
    }
}
