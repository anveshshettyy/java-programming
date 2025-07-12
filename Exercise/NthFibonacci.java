package Exercise;

public class NthFibonacci {
    static int fib(int n, int a, int b) {
        if(n == 0) return a;
        System.out.print(a+" ");
        return fib(--n, b, a+b);

    }
    public static void main(String[] args) {
        int n = 7;

        int res = fib(n, 0, 1);

        System.out.println(res);
    }
}
