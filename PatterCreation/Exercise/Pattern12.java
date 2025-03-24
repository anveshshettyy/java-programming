package PatterCreation.Exercise;

public class Pattern12 {
    public static void main(String[] args) {
        int n = 9;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print((i+j >= n/2|| i-j == -n/2  ) ? "+ ": "  ");
            }
            
            System.out.println();
        }
    }
}
