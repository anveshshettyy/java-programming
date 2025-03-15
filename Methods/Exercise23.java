package Methods;

public class Exercise23 {
    static int SingleDigit(int a) {
        int temp = a, sum = 0, res = 11;
        while(res > 10) {
            sum = 0;
            
            while(temp > 0 ) {
                int rem = temp % 10;
                temp /= 10;
                sum += rem;
            } 
            res = sum;
            temp = res;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 125369;
        System.out.println(SingleDigit(n));
    }
}
