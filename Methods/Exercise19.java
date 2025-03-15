package Methods;

public class Exercise19 {
    static int res(int a) {
        int count=0, rev=0,n=1, sum = 0;;
        while(a > 0) {
            int rem = a % 10;
            a = a/10;
            sum += rem;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 125369;
        System.out.println("Sum is: "+res(n));
    }
}
