package Methods;

public class Exercise17 {
    static int res(int a) {
        int max = 0;
        while(a > 0) {
            int rem = a % 10;
            a = a/10;
            if(rem > max) {
                max = rem;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int n = 125369;
        System.out.println("Max Digit is: "+res(n));
    }
}
