package Methods;

public class Exercise22 {
    static long FactoialSum(long a) {
        long  sum = 0;
        while(a > 0) {
            long rem = a % 10;
            long mul = 1;
            for(int i=1; i<=rem; i++) mul *= i;
            
            sum += mul;
            a /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        long n = 125369;
        System.out.println(FactoialSum(n));
    }
}
