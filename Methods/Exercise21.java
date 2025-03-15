package Methods;

public class Exercise21 {
    static int Summation (int a) {
        int rem = 0,mul = 0;
        while (a > 0) {
            rem = a % 10;
            a /= 10;
            for (int i = 1; i <= rem; i++)  mul = mul + i;
        }
        return mul;
    }

    public static void main(String[] args) {
        int n = 125369;
        System.out.println(Summation(n));
    }
}
