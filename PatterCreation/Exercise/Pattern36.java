package PatterCreation.Exercise;

public class Pattern36 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print((i-j<=0 ) ? (char)('A'+(n-i-1))+" " : " ");
            }
            System.out.println();
        }
    }
}
