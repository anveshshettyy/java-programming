package Methods;

public class Exercise22 {
    static long FactoialSum(int a) {
        int sum = 0;
        while(a > 0) {
            int rem = a % 10;
            int mul = 1;
            for(int i=1; i<=rem; i++) mul  *= i;
            
            sum += mul;
            a /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 123456789;
        System.out.println(FactoialSum(n));
    }
}
