package Methods;

public class Exercise12 {
    static int res(int a, int b) {
        int x = a;
        while(b > 1) {
            a = x * a;
            b--;
        }
        return a;
    }
    public static void main(String[] args) {
        int a = 10, b = 3;
        System.out.println(res(a,b));
    }
}
