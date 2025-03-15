package Methods;

public class Exercise16 {
    // static int res(int a) {
    //     int rev=0,n=1;
    //     while(a > 0) {
    //         int rem = a % 10;
    //         a = a/10;
    //         rev = (rem%2 != 0) ?  (1 * n + rev) :   (0 * n + rev);
    //         n*=10;
    //     }
    //     return rev;
    // }
    // public static void main(String[] args) {
    //     int n = 22345;
    //     System.out.println("Encoded Value: "+res(n));
    // }

    static void res(int a) {
        int temp = a, rev = 0;

        while(temp > 0) {
            int rem = temp % 10;
            temp /= 10;
            rev = rev * 10 + rem;
        }

        while(rev > 0) {
            int rem = rev % 10;
            rev = rev/10;
            System.out.print((rem%2 != 0) ? 1 : 0);  
        }
    }
    public static void main(String[] args) {
        int n = 22221122;
        res(n);
    }
}
