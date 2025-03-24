package PatterCreation;

public class Star1 {
    public static void main(String[] args) {
        int n=10;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                // if( i-j == 0 ) {
                // if(i+j == n-1) {
                // if(i-j == 0 || i+j == n-1) {
                // if(i==n/2 && j==n/2) {
                // if(i==0 || j==0 || i==n-1 || j==n-1) {
                // if(j==0 || i==n-1 || i-j == 0) {
                // if(i-j==0 || i==0 || j==n-1) {
                // if(i==n/2 || j==n/2) {
                if(((i==n/2)&&(j>=n/4)&&(j<=3*n/4)) || j==n-1 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
