package NumberConversion;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 13;
        int res = 0, pow = 1;
        while (n > 0) {
            int rem = n % 2;
            res += (rem * pow); 
            n /= 2;
            pow *= 10;
        }
        System.out.print(res);
    }
}
