package Methods;

public class Exercise20 {
    static int res(int a) {
        int  mul = 1;
        while(a > 0) {
            int rem = a % 10;
            a = a/10;
            mul *= rem;
        }
        return mul;
    }
    public static void main(String[] args) {
        int n = 125369;
        System.out.println("Product is: "+res(n));
    }
}
