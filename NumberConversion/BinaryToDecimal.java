package NumberConversion;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int n = 1001;
        int pow = 1, res = 0;
        while (n > 0) {
            int rem = n % 10;
            res += (rem * pow);
            n /= 10;
            pow *= 2;
        }
        System.out.println(res);
    }
}
