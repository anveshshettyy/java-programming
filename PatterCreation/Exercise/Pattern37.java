package PatterCreation.Exercise;

public class Pattern37 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print((i-j<=0 ) ? (char)('A'+((n / 2)-j + 2))+" " : " ");
            }
            System.out.println();
        }
    }
}
