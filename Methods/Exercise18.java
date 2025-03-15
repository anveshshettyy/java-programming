package Methods;

public class Exercise18 {
    static int res(int a) {
        int count=0, rev=0,n=1, min = 999;
        while(a > 0) {
            int rem = a % 10;
            a = a/10;
            if(rem < min) {
                min = rem;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int n = 125369;
        System.out.println("Min Digit is: "+res(n));
    }
}
