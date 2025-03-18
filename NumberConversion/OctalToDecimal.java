package NumberConversion;

public class OctalToDecimal {
    public static void main(String[] args) {
        int n = 24;
        int pow = 1, res = 0;
        while (n > 0) {
            int rem = n % 10;
            res += (rem * pow);
            n /= 10;
            pow *= 8;
        }
        System.out.println(res);
    }
}
