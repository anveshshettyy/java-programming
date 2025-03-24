package PatterCreation.Exercise;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 9;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i-j>0) {
                    System.out.print("*  ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
