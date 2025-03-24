package PatterCreation;

public class NumbersPrinting {
    public static void main(String[] args) {
        int n=5;                                                                                                                                    
        for(int i=0; i<=n; i++) {
            for(int j=0; j<n; j++) {
                if(i-j<0){
                    System.out.print(" ");
                } else {
                    System.out.print(i);
                    // System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
