package PatterCreation;

public class GenerateSequence1 {
    static void GenerateSequence1(int n) {
        int half = n / 2;
        // int i=0, j=0;
        // while(n>=0) {
        //     if(i<half) System.out.print(i+" ");
        //     if(i>=half) {
        //         System.out.print(half - j+" ");
        //         j++;
        //     } 
        //     n--;
        //     i++;
        // }

        // for(int i=0; i<n; i++) {
        //     if(i<n/2) System.out.print(i+" ");
        //     else {
        //         System.out.print(n-i-1+" ");
        //     }
        // }

        for(int i=0; i<n; i++) System.out.print((i<n/2) ? i+" " : n-i-1+" ");
        
    }
    public static void main(String[] args) {
        int n = 11;
        GenerateSequence1(n);
    }
}
