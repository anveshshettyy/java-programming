package PatterCreation.Exercise;

public class Pattern29 {
    public static void main(String[] args) {
        int n = 7, count = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i-j >= 0 && j<=n/2 && i+j<= n-1 && j<=n/2){
                    count = Math.abs((n/2)-(i-j));
                    System.out.print((char)('A'+ count)+"  ");
                } else 
                    System.out.print("   ");
            }   
            System.out.println();
        }
    }
}
