package Methods;

public class Exericse14 {
    static int res(int a) {
        int count=0, rev=0,n=1;
        while(a > 0) {
            int rem = a % 10;
            a = a/10;
            if(rem%2 == 0) {
                count++;
                rev = rem*n + rev;
                n*=10;
            }
        }
        System.out.println("Count: "+count);
        return rev;
    }
    public static void main(String[] args) {
        int n = 123456;
        System.out.println("Even Numbers are: "+res(n));
    }
}
