package PatterCreation.Exercise;

public class Pattern22 {
    public static void main(String[] args) {
        int n = 7;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print((i-j <= 0 && j>=n/2 && i+j>= n-1 && j>=n/2 ) ?  Math.abs((n/2)-i+(n-j-1))+"  " : "   ");
            }
            System.out.println();
        }
    }
}
