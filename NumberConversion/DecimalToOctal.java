package NumberConversion;

public class DecimalToOctal {
    public static void main(String[] args) {
        int n = 256;
        int pow = 1, res = 0;
        while (n > 0) {
            int rem = n % 8;
            res += (rem * pow);
            n /= 8;
            pow *= 10;
        }
        System.out.println(res);
    }
}
