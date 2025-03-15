package NumberLogic;

public class P1_NaturalNum {
    static int Res(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++)
            sum += i;
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Res(n));
    }
}
