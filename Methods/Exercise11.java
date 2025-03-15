package Methods;

public class Exercise11 {
    static int res(int a) {
        int count=0;
        while(a > 0) {
            a /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 125369;
        System.out.println(res(n));
    }
}
