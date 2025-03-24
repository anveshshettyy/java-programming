package PatterCreation;

public class PhoneNumber {
    public static void main(String[] args) {
        int n = 6;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(
                (((j == 0)) || ((j == n - 1) && (i > n / 2)) || i == n / 2 || i == 0 || i == n - 1)
                        ? "* "
                        : "  ");                                
            }
            System.out.print("  ");

            for(int j=0; j<n; j++) {
                System.out.print((i == 0 || i == n - 1 || i == n / 2 || j == n - 1) ? "* " : "  ");
            }
            System.out.print("  ");

            for(int j=0; j<n; j++) {

                System.out.print(
                (((j == 0)) || ((j == n - 1) && (i > n / 2)) || i == n / 2 || i == 0 || i == n - 1)
                        ? "* "
                        : "  ");                                
            }
            System.out.print("  ");

            for(int j=0; j<n; j++) {
                System.out.print((i == 0 || j == 0 || j == n - 1 || i == n - 1) ? "* " : "  ");
            }
            System.out.print("  ");

            for(int j=0; j<n; j++) {

                System.out.print((((j == 0) && (i < n / 2)) || j == n - 1 || i == n / 2) ? "* " : "  ");
                            
            }
            System.out.print("  ");

            for(int j=0; j<n; j++) {
            System.out.print((i == 0 || j == n - 1) ? "* " : "  ");
            }
            System.out.print("  ");

            for(int j=0; j<n; j++) {

                System.out.print((i == 0 || j == n - 1 || j == 0 || i == n / 2 || i == n - 1) ? "* " : "  ");
                           
            }
            System.out.print("  ");

            for(int j=0; j<n; j++) {
                System.out.print((((j == 0) && (i < n / 2)) || ((j == n - 1) && (i > n / 2)) || i == n / 2
                                || i == 0 || i == n - 1) ? "* " : "  ");
            }
            System.out.print("  ");

            for(int j=0; j<n; j++) {
                System.out.print((i == 0 || ((j == n - 1) && (i < n / 2)) || i == n / 2
                                || ((j == 0) && (i > n / 2)) || i == n - 1) ? "* " : "  ");
            }
            System.out.print("  ");

            for(int j=0; j<n; j++) {
                System.out.print(
                                (i == 0 || j == n - 1 || ((j == 0) && (i <= n / 2)) || i == n / 2 || i == n - 1) ? "* "
                                        : "  ");
            }
            System.out.println();
        }
    }
}
