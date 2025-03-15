package NumberLogic;

public class XpowNbyNfact {
    static int Fact(int n) {
        return (n==1) ? 1 : n *Fact(n-1);
    }
    static int Pow(int n, int x) {
        int temp1 = n, temp2 = x;
        while(temp2 > 1) {
            n = n * temp1;
            temp2--;
        }
        return n;
    }
    public static void main(String args[]) {
        int n = 5, x = 3;
        double val1 = Fact(n);
        double val2 = Pow(n,x);
        double res = val2 / val1;
        System.out.println(val2);
    }
}
