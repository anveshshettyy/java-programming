package BitManipulation;

public class AddBinary {
    public static void main(String[] args) {
        int a = 10010, b = 1110;

        int carry = 0;
        int res = 0, pow = 1;
        while(a > 0 || b > 0 || carry != 0 ) {
            int sum = 0;
            int rem1 = a % 10;
            int rem2 = b % 10;
            sum = rem1 + rem2 + carry;
            if(sum == 2) {
                res += 0*pow;
                carry = 1;
            } else if(sum == 3) {
                res += 1 * pow;
                carry = 1;
            } else if(sum == 1) {
                res += 1 * pow;
                carry = 0;
            } else {
                res += 0 * pow;
                carry = 0;
            }
            a /= 10;
            b /= 10;
            pow *= 10;
        }

        System.out.println(res);
    }
}
