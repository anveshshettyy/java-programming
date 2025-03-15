package Methods;

public class Exercise23 {
    static int SingleDigit(int a) {
        int temp = a, sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            temp /= 10;
            sum += rem;
        }
        return (sum > 10) ? SingleDigit(sum) : sum;
    }

    public static void main(String[] args) {
        int n = 125369;
        System.out.println(SingleDigit(n));
    }
}

// while(res > 10) {
        // sum = 0;
        // while(temp > 0 ) {
        // int rem = temp % 10;
        // temp /= 10;
        // sum += rem;
        // }
        // res = sum;
        // temp = res;
        // }
        // return sum;