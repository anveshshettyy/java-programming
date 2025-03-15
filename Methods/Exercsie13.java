package Methods;

public class Exercsie13 {
    static int res(int a) {
        int rev= 0;
        while(a > 0) {
            int rem = a % 10;
            a /= 10;
            rev = rev*10 + rem;
        }
        return rev;
    }
    public static void main(String[] args) {
        int n = 125369;
        System.out.println(res(n));
    }
}
