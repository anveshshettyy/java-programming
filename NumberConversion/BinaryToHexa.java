package NumberConversion;

public class BinaryToHexa {
    static int Binrary2Decimal(int n) {
        int res = 0, mul = 1;
        while(n>0) {
            int rem = n%2;
            res += rem * mul;
            n /= 10;
            mul *=2;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 1100;
        int pow = 1, res = 0;

        int decimal = Binrary2Decimal(n);
        while (decimal > 0) {
            int rem = decimal % 16;
            res += (rem * pow);
            decimal /= 16;
            pow *= 10;
        }
        System.out.println(res);
    }
}
