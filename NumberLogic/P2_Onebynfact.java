package NumberLogic;

public class P2_Onebynfact {
    static int Fact(int n) {
        return (n==1) ? 1 : n *Fact(n-1);
    }
    public static void main(String args[]) {
        int n = 5;
        double val = Fact(n);
        double res = 1 / val;
        System.out.println(res);
    }
}
